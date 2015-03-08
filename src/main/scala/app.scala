import tool.Scheduler
import com.github.nscala_time.time.Imports._

object main extends App {
  DateTimeZone.setDefault(DateTimeZone.UTC)
  
  val scheduler = new Scheduler

  println(scheduler.search.length)
}