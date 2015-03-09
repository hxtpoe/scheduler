import tool.Scheduler
import com.github.nscala_time.time.Imports._

object main extends App {
  DateTimeZone.setDefault(DateTimeZone.UTC)

  val scheduler = new Scheduler

  scheduler.run

  // print slots in "best availability" order
  scheduler.suitableSlots.toList.sortBy { -_._2 }.foreach(println)
}