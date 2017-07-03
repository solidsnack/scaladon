import li.pika.consolydon

object Main extends App {
  val engine = consolydon.Engine()
  try engine.processArguments(args) catch {
    case e: Exception => {
      Console.err.println(s"${e}")
      System.exit(1)
    }
  }
}