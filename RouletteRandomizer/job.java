public class job{
  //constructor for jobs in ffxiv
  //Job name : String
  private String name;
  //Job type : String
  private String type;
  //Job level : int
  private int level;
  public job(){
    name = " ";
    type = " ";
    level = 0;
  }
  public job(String n,String t,int l){
    name = n;
    type = t;
    level = l;
  }

  public String getName(){
    return name;
  }

  public void setName(String n){
    name = n;
  }

  public int getLevel(){
    return level;
  }


}
