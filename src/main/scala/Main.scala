object Main {
  def main(args:Array[String]) = {
    MakeReleaseNotes(new java.io.File(args(0)), args(1), args(2))
  }
}
