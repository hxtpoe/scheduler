import tool.DataProvider
import com.github.nscala_time.time.Imports._

package tool {
  class Scheduler {
    val numberOfSlots = 119
    var suitableSlots = scala.collection.mutable.Map[String, Int]()

    val dataProvider = new DataProvider

    def getSlots(): Seq[Interval] = {
      for (i <- 0 to numberOfSlots) yield new Interval(DateTime.parse("2015-03-09T00:00:00") + i.hours, DateTime.parse("2015-03-09T00:00:00") + i.hours + 1.hours)
    }

    def run(): Unit = {

      dataProvider.getData map {
        case row(_, _, list) => {
          for {
            slot <- getSlots
            userSlots <- list
            if (userSlots.contains(slot))
          } yield {
            incrementSuitableSlots(slot)
            slot
          }
        }
      }
    }

    def incrementSuitableSlots(slot: Interval): Unit = {
      if (suitableSlots.contains(slot.toString)) {
        val oldValue = suitableSlots(slot.toString)
        suitableSlots(slot.toString) = oldValue + 1
      } else {
        suitableSlots(slot.toString) = 1
      }
    }
  }
}
