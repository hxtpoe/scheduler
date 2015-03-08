import tool.Scheduler
import org.specs2.mock.Mockito
import org.specs2.mutable.Specification
import org.mockito.Matchers._

object schedulerSpec extends Specification with Mockito {

  val m = new Scheduler

  "run returns correct string" in {
    m.run() must be equalTo ("running...")
  }

  "findEmptySlot return boolean" in {
    m.findEmptySlot must be equalTo (true)
  }

}