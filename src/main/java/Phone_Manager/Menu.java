package Phone_Manager;

public class Menu {
    public void menu_main(){
        System.out.println("------------------------MENU-----------------------");
        System.out.println();
        System.out.println("1.Add device");
        System.out.println("2.Edit device information");
        System.out.println("3.Delete device");
        System.out.println("4.display all device information");
        System.out.println("5.Sort/Filter device");
        System.out.println("6.exit");
        System.out.println("---------------------------------------------------");
    }

    public void menu_filter(){
        System.out.println("-----------------------SORT/FILTER----------------------");
        System.out.println();
        System.out.println("1.Filter by manufacturer");
        System.out.println("2.Filter by price");
        System.out.println("3.Sort by descending price");
        System.out.println("4.Sort by product launch date from new to old");
        System.out.println();
        System.out.println("---------------------------------------------------");
    }
    public void edit(){
        System.out.println("--------------Select the item to edit--------------");
        System.out.println();
        System.out.println("1.Edit phone name");
        System.out.println("2.Edit producer");
        System.out.println("3.Rom parameter editing ");
        System.out.println("4.Ram parameter editing");
        System.out.println("5.Edit Date");
        System.out.println("6.Edit price");
        System.out.println("7.Exit");
        System.out.println();
        System.out.println("---------------------------------------------------");
    }
}