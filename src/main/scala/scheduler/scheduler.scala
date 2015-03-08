import tool.DataProvider
import com.github.nscala_time.time.Imports._

package tool {
  class Scheduler {
    val numberOfSlots = 119
    val dataProvider = new DataProvider
    def run() = "running..."
    def findEmptySlot() = true

    def getSlots(): Seq[Interval] = {
      for (i <- 0 to numberOfSlots) yield new Interval(DateTime.parse("2015-03-09T00:00:00") + i.hours, DateTime.parse("2015-03-09T00:00:00") + i.hours + 1.hours)
    }

    def search() = {
      // getData map {
      // 	case row(_, _, list) => println(list)
      // }

      for {
        slot <- getSlots
        userSlots <- dataProvider.singleUserData
        if (userSlots.contains(slot))
      } yield slot

    }
  }
}
