class Test12{
  public static void main(String[] args) {
    first:{
      System.out.println("first");
      second:{
        System.out.println("second");
        third:{
          System.out.println("Third");
          break second;
          System.out.println("wont execute");//will show compilation error as "not reachable"
        }
        System.out.println("wont execute too");//will show compilation error as "not reachable"
      }
      System.out.println("this will execute");
    }
  }
}
