import com.github.nscala_time.time.Imports._

package tool {
  case class row(
    name: String,
    timezone: String,
    availabeSlots: List[Interval])

  class DataProvider {

    def getData() = List(
      row("John Smith", "Europe/Warsaw", List(
        new Interval(DateTime.parse("2015-03-09T08:00:00"), DateTime.parse("2015-03-09T16:00:00")),
        new Interval(DateTime.parse("2015-03-10T08:00:00"), DateTime.parse("2015-03-10T16:00:00")),
        new Interval(DateTime.parse("2015-03-11T08:00:00"), DateTime.parse("2015-03-11T16:00:00")),
        new Interval(DateTime.parse("2015-03-12T08:00:00"), DateTime.parse("2015-03-12T16:00:00")),
        new Interval(DateTime.parse("2015-03-13T08:00:00"), DateTime.parse("2015-03-13T16:00:00")))),

      row("Kasia Cichopek", "Asia/Jerusalem", List(
        new Interval(DateTime.parse("2015-03-09T08:00:00"), DateTime.parse("2015-03-09T16:00:00")),
        new Interval(DateTime.parse("2015-03-10T08:00:00"), DateTime.parse("2015-03-10T16:00:00")),
        new Interval(DateTime.parse("2015-03-11T08:00:00"), DateTime.parse("2015-03-11T16:00:00")),
        new Interval(DateTime.parse("2015-03-12T08:00:00"), DateTime.parse("2015-03-12T16:00:00")),
        new Interval(DateTime.parse("2015-03-13T08:00:00"), DateTime.parse("2015-03-13T16:00:00")))),

      row("Fryderyk Chopin", "America/Havana", List(
        new Interval(DateTime.parse("2015-03-11T11:00:00"), DateTime.parse("2015-03-11T12:00:00")))), // !!

      row("Peter Sagan", "America/Havana", List(
        new Interval(DateTime.parse("2015-03-11T11:00:00"), DateTime.parse("2015-03-11T12:00:00"))))) // !!
  }
}
