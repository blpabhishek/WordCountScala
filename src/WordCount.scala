
class WordCount(text: String) {
  private def charCount(): Int= text.length
  private def byteCount(): Int= text.getBytes().length
  private def wordCount(): Int= text.split("\\s").length
  private def lineCount(): Int= text.split("\n").length
  private def getOutput(fileName:String): String = "\t\b"+lineCount+"\t\b"+wordCount+"\t\b"+byteCount+" "+fileName

  private def arrange(options: String): String ={
    var result:String =new String("\t\b")
    if(options.indexOf("l")>=0) result+=lineCount+"\t\b"
    if(options.indexOf("w")>=0) result+=wordCount+"\t\b"
    if(options.lastIndexOf("m") > options.lastIndexOf("c")) result+=charCount
    if(options.lastIndexOf("m") < options.lastIndexOf("c")) result+=byteCount
    result
  }

   def getOutput(fileName:String, option: String): String = {
    if(option.equals("")) return getOutput(fileName)
    arrange(option)+" "+fileName
  }
}
