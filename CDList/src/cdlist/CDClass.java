package cdlist;

public class CDClass {
    
    private String artistName;
    private String albumTitle;
    private String yearOfRelease;
    private String recordLabel;
    
    void setartistName(String artist)
    {
        artistName = artist;
    }
    
    void setalbumTitle(String album)
    {
        albumTitle = album;
    }
    
    void setyearOfRelease(String yor)
    {
        yearOfRelease = yor;
    }
    
    void setlabel(String label)
    {
        recordLabel = label;
    }
    
    public String getartistName()
    {
        return artistName;
    }
    
    public String getalbumTitle()
    {
        return albumTitle;
    }
    
    public String getyearOfRelease()
    {
        return yearOfRelease;
    }
    
    public String getlabel()
    {
        return recordLabel;
    }
    
    void printout()
    {
        System.out.println("Artist Name: " + artistName);
        System.out.println("Album Title: " + albumTitle);
        System.out.println("Year Of Release: " + yearOfRelease);
        System.out.println("Record Label: " + recordLabel);
        System.out.println();
               
    }
}
