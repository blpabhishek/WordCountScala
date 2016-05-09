import java.nio.file.{Files, Paths}
import java.util._

object WordCountUtil {
  def processFile(file: String,options:String) :Unit = {
    val allBytes: Array[Byte] = Files.readAllBytes(Paths.get(file))
    val wc = new WordCount(new String(allBytes))
    val output = wc.getOutput(file,options)
    println(output)
  }

  def main(args: Array[String]) {
    val parser = new ArgsParser(args)
    val files: ArrayList[String] = parser.getFiles
    val options = parser.getOptions
    val it: Iterator[String] = files.iterator()
    while (it.hasNext)
      processFile(it.next(),options)
  }
}
