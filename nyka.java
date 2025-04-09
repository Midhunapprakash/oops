import java.util.Scanner;
class product{
int price;
int quantity;
product(int p,int q){
price=p;
quantity=q;
}
}
class brand extends product{
String brand_type;
brand(int p,int q,String b){
super(p,q);
brand_type=b;
}
}
class nyka extends brand{
int rating;
int expiry_date;
nyka(int p,int q,String b,int r,int e){
super(p,q,b);
rating=r;
expiry_date=e;
}

void display() {
System.out.println("\n__________INFORMATION ABOUT PRODUCTS__________\n");
System.out.println("price:"+price);
System.out.println("Quantity:"+quantity);
System.out.println("\n___________BRAND DETAILS____________\n");
System.out.println("brand_type:"+brand_type);
System.out.println("\n___________INFORMATION ABOUT NYKA__________\n");
System.out.println("rating:"+rating);
System.out.println("Expiry_date:"+expiry_date);
}

public static void main(String[]  arg){
Scanner sc1 = new Scanner(System.in);
System.out.println("Enter the no.of products:");
int num = sc1.nextInt();
nyka [] arr = new nyka[num];
for( int i=0;i<num;i++){
Scanner sc = new Scanner(System.in);
System.out.println("Enter the product details:");
System.out.println("\nprice");
int price= sc.nextInt();
System.out.println("\nquantity");
int quantity=sc.nextInt();
System.out.println("\nbrand_type");
String brand_type=sc.next();
System.out.println("\nrating");
int rating=sc.nextInt();
System.out.println("\nexpiry_date");
int expiry_date = sc.nextInt();
arr [i] = new nyka(price,quantity,brand_type,rating,expiry_date);
}
for(int i=0;i<num;i++)
{
arr[i].display();
}
sc1.close();
}
}
