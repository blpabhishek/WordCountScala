import java.util._

class ArgsParser(args: Array[String]) {
  private def isOption(arg :String):Boolean = arg.indexOf("-")==0

  def getOptions : String = {
    val builder: StringBuilder = new StringBuilder
    for (arg <- args )
      if(isOption(arg)) builder.append(arg)
    builder.toString
  }

  def getFiles: ArrayList[String] = {
    val files: ArrayList[String] = new ArrayList[String](args.length)
    for (arg <- args )
      if(!isOption(arg)) files.add(arg)
    files
  }
}
