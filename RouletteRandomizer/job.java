public class job{
  //constructor for jobs in ffxiv
  //Job name : String
  //Job type : String
  //Job level : int
  private String name;
  private String type;
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
    this.name = n;
  }

  public int getLevel(){
    return level;
  }
  public void setLevel(int l){
    this.level = l;
  }
  public String getType(){
    return type;
  }
  public void setType(String t){
    this.type = t;
  }

  // public void smartType(job j){
    //check for job name and assign type based on list
    //if((j.getName().toLowerCase()=="paladin")||(j.getName().toLowerCase()=="warrior")||(j.getName().toLowerCase()=="gunbreaker")||j.getName().toLowerCase()=="dark knight")
  //  {
  //    j.setType("Tank");
//    }
//  }


}
