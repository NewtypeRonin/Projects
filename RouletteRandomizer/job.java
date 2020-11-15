public class job{
  //constructor for jobs in ffxiv
  //Job name : String
  String name;
  //Job type : String
  String type;
  //Job level : int
  int level;
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
