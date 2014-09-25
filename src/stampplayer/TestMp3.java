package stampplayer;

import java.util.ArrayList;

public class TestMp3 {

    public static void main(String[] args)
    {
      ArrayList<Mp3File> mp3List = new ArrayList<Mp3File>();
      mp3List.add(new Mp3File("song1", "//qweqwe"));
      mp3List.add(new Mp3File("track2", "//tr"));
      mp3List.add(new Mp3File("melody3", "//mel"));
      mp3List.add(new Mp3File("simphony4", "//sss"));
      mp3List.add(new Mp3File("melody5", "//mel"));
      printList(mp3List);
      
      searchFile(mp3List, "tra");
      searchFile(mp3List, "mel");
    }
    
    private static void searchFile(ArrayList list, String needle)
    {
      System.out.println("Searching " + needle);
      for( Object obj : list)
      {
        if(obj instanceof Mp3File)
        {
          Mp3File mp3File = (Mp3File) obj;
          if ( mp3File.SearchInName( needle))
            System.out.println(mp3File.getName()+" "+mp3File.getPath());
        }
      }
    }
    
    private static void printList(ArrayList list)
    {
      for( Object obj : list)
      {
        if(obj instanceof Mp3File)
        {
          Mp3File mp3File = (Mp3File) obj;
          System.out.println(mp3File.getName()+" "+mp3File.getPath());
        }
        else
        {
          System.out.println(obj);
        }
      }
    }

}
