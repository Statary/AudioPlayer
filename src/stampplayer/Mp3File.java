package stampplayer;

import java.nio.file.Path;

public class Mp3File
{
  private String name;
  private String path;

  public Mp3File( String name, String path)
  {
    this.name = name;
    this.path = path;
  }

  public String getName() {
    return name;
  }
  public String getPath() {
    return path;
  }
  
  public boolean SearchInName( String needle)
  {
    if(this.name.indexOf(needle) != -1)
      return true;
    else
      return false;
  }
  
}
