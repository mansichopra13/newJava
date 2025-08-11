import java.util.Scanner;

class Electric_store
{
// username getter and setter
private String userName;
public String getuserName()
{
return userName;
}
public void setuserName(String userName)
{
this.userName=userName;
}

// userno getter and setter
private int userNo;
public int getuserNo()
{
return userNo;
}
public void setuserNo(int userNo)
{
this.userNo=userNo;
}


//usermail getter and setter
private String userMail;
public String getuserMail()
{
return userMail;
}
public void setuserMail(String userMail)
{
this.userMail=userMail;
}

String Product_name;
String Model_name;
double Product_price;
String Product_color;
int Model_year;
String Warranty;

Electric_store(String Product_name,String Model_name,double Product_price,String Product_color,
      int Model_year,String Warranty)
{
this.Product_name=Product_name;
this.Model_name=Model_name;
this.Product_price=Product_price;
this.Product_color=Product_color;
this.Model_year=Model_year;
this.Warranty=Warranty;
}
public void profile()
{
System.out.println(getuserName());
System.out.println(getuserNo());
System.out.println(getuserMail());
}

}

//headphone types
class Headphone extends  Electric_store
{

Headphone(String Product_name, String Model_name, double Product_price, String Product_color, int Model_year,
String Warranty)
{
super(Product_name, Model_name, Product_price, Product_color, Model_year, Warranty);

}
}
class Wired extends Headphone
{

Wired(String Product_name, String Model_name, double Product_price, String Product_color, int Model_year,
String Warranty)
{
super(Product_name, Model_name, Product_price, Product_color, Model_year, Warranty);

}
}//wired headphone
class Apple_w extends Wired
{

Apple_w(String Product_name, String Model_name, double Product_price, String Product_color, int Model_year,
String Warranty)
{
super(Product_name, Model_name, Product_price, Product_color, Model_year, Warranty);

}
}
class Realme_w extends Wired
{

Realme_w(String Product_name, String Model_name, double Product_price, String Product_color, int Model_year,
String Warranty) {
super(Product_name, Model_name, Product_price, Product_color, Model_year, Warranty);

}
}
class Boat_w extends Wired
{

Boat_w(String Product_name, String Model_name, double Product_price, String Product_color, int Model_year,
String Warranty) {
super(Product_name, Model_name, Product_price, Product_color, Model_year, Warranty);

}
}
class Boult_w extends Wired
{

Boult_w(String Product_name, String Model_name, double Product_price, String Product_color, int Model_year,
String Warranty)
{
super(Product_name, Model_name, Product_price, Product_color, Model_year, Warranty);

}
}
class JBL_w extends Wired
{

JBL_w(String Product_name, String Model_name, double Product_price, String Product_color, int Model_year,
String Warranty)
{
super(Product_name, Model_name, Product_price, Product_color, Model_year, Warranty);

}
}
class Samsung_w extends Wired
{

Samsung_w(String Product_name, String Model_name, double Product_price, String Product_color, int Model_year,
String Warranty) {
super(Product_name, Model_name, Product_price, Product_color, Model_year, Warranty);

}
}
class Oneplus_w extends Wired
{

Oneplus_w(String Product_name, String Model_name, double Product_price, String Product_color, int Model_year,
String Warranty) {
super(Product_name, Model_name, Product_price, Product_color, Model_year, Warranty);

}
}//bluetoth headphone
class Bluetooth extends Headphone
{

Bluetooth(String Product_name, String Model_name, double Product_price, String Product_color, int Model_year,
String Warranty)
{
super(Product_name, Model_name, Product_price, Product_color, Model_year, Warranty);

}
}
class Apple_b extends Bluetooth
{

Apple_b(String Product_name, String Model_name, double Product_price, String Product_color, int Model_year,
String Warranty)
{
super(Product_name, Model_name, Product_price, Product_color, Model_year, Warranty);

}
}//apple types
class Airpod extends Apple_b
{

Airpod(String Product_name, String Model_name, double Product_price, String Product_color, int Model_year,
String Warranty)
{
super(Product_name, Model_name, Product_price, Product_color, Model_year, Warranty);

}
}
class Airpod_pro extends Apple_b
{

Airpod_pro(String Product_name, String Model_name, double Product_price, String Product_color, int Model_year,
String Warranty) {
super(Product_name, Model_name, Product_price, Product_color, Model_year, Warranty);

}
}
class Airpod2 extends Apple_b
{

Airpod2(String Product_name, String Model_name, double Product_price, String Product_color, int Model_year,
String Warranty) {
super(Product_name, Model_name, Product_price, Product_color, Model_year, Warranty);

}
}
class Samsung_b extends Bluetooth
{

Samsung_b(String Product_name, String Model_name, double Product_price, String Product_color, int Model_year,
String Warranty)
{
super(Product_name, Model_name, Product_price, Product_color, Model_year, Warranty);

}
}//samsung types
class Samsung_levelU2 extends Samsung_b
{

Samsung_levelU2(String Product_name, String Model_name, double Product_price, String Product_color, int Model_year,
String Warranty)
{
super(Product_name, Model_name, Product_price, Product_color, Model_year, Warranty);

}
}
class Samsung_buds extends Samsung_b
{

Samsung_buds(String Product_name, String Model_name, double Product_price, String Product_color, int Model_year,
String Warranty) {
super(Product_name, Model_name, Product_price, Product_color, Model_year, Warranty);

}
}
class Oneplus_b extends Bluetooth
{

Oneplus_b(String Product_name, String Model_name, double Product_price, String Product_color, int Model_year,
String Warranty) {
super(Product_name, Model_name, Product_price, Product_color, Model_year, Warranty);

}
}//oneplus types
class Oneplus_bullet extends Oneplus_b
{

Oneplus_bullet(String Product_name, String Model_name, double Product_price, String Product_color, int Model_year,
String Warranty) {
super(Product_name, Model_name, Product_price, Product_color, Model_year, Warranty);

}
}
class Oneplus_buds extends Oneplus_b
{

Oneplus_buds(String Product_name, String Model_name, double Product_price, String Product_color, int Model_year,
String Warranty) {
super(Product_name, Model_name, Product_price, Product_color, Model_year, Warranty);

}
}
class JBL_b extends Bluetooth
{

JBL_b(String Product_name, String Model_name, double Product_price, String Product_color, int Model_year,
String Warranty) {
super(Product_name, Model_name, Product_price, Product_color, Model_year, Warranty);

}
}//jbl types
class JBL_neckband extends JBL_b
{

JBL_neckband(String Product_name, String Model_name, double Product_price, String Product_color, int Model_year,
String Warranty) {
super(Product_name, Model_name, Product_price, Product_color, Model_year, Warranty);

}
}
class JBL_buds extends JBL_b
{

JBL_buds(String Product_name, String Model_name, double Product_price, String Product_color, int Model_year,
String Warranty) {
super(Product_name, Model_name, Product_price, Product_color, Model_year, Warranty);

}
}
class Boult_b extends Bluetooth
{

Boult_b(String Product_name, String Model_name, double Product_price, String Product_color, int Model_year,
String Warranty)
{
super(Product_name, Model_name, Product_price, Product_color, Model_year, Warranty);

}
}//boult types
class Boult_neckband extends Boult_b
{

Boult_neckband(String Product_name, String Model_name, double Product_price, String Product_color, int Model_year,
String Warranty) {
super(Product_name, Model_name, Product_price, Product_color, Model_year, Warranty);

}
}
class Boult_buds extends Boult_b
{

Boult_buds(String Product_name, String Model_name, double Product_price, String Product_color, int Model_year,
String Warranty) {
super(Product_name, Model_name, Product_price, Product_color, Model_year, Warranty);

}
}
class Boat_b extends Bluetooth
{

Boat_b(String Product_name, String Model_name, double Product_price, String Product_color, int Model_year,
String Warranty) {
super(Product_name, Model_name, Product_price, Product_color, Model_year, Warranty);

}
}//boat types
class Boat_neckband extends Boat_b
{

Boat_neckband(String Product_name, String Model_name, double Product_price, String Product_color, int Model_year,
String Warranty) {
super(Product_name, Model_name, Product_price, Product_color, Model_year, Warranty);

}
}
class Boat_buds extends Boat_b
{

Boat_buds(String Product_name, String Model_name, double Product_price, String Product_color, int Model_year,
String Warranty) {
super(Product_name, Model_name, Product_price, Product_color, Model_year, Warranty);

}
}
class Realme_b extends Bluetooth
{

Realme_b(String Product_name, String Model_name, double Product_price, String Product_color, int Model_year,
String Warranty) {
super(Product_name, Model_name, Product_price, Product_color, Model_year, Warranty);

}
}
class Realme_neckband extends Realme_b
{

Realme_neckband(String Product_name, String Model_name, double Product_price, String Product_color, int Model_year,
String Warranty) {
super(Product_name, Model_name, Product_price, Product_color, Model_year, Warranty);

}
}
class Realme_buds extends Realme_b
{

Realme_buds(String Product_name, String Model_name, double Product_price, String Product_color, int Model_year,
String Warranty) {
super(Product_name, Model_name, Product_price, Product_color, Model_year, Warranty);

}
}//laptop
class Laptop extends Electric_store
{

Laptop(String Product_name, String Model_name, double Product_price, String Product_color, int Model_year,
String Warranty)
{
super(Product_name, Model_name, Product_price, Product_color, Model_year, Warranty);

}
}
class Asus_l extends Laptop
{

Asus_l(String Product_name, String Model_name, double Product_price, String Product_color, int Model_year,
String Warranty)
{
super(Product_name, Model_name, Product_price, Product_color, Model_year, Warranty);

}
}//asus types
class Asus_gaming extends Asus_l
{

Asus_gaming(String Product_name, String Model_name, double Product_price, String Product_color, int Model_year,
String Warranty)
{
super(Product_name, Model_name, Product_price, Product_color, Model_year, Warranty);

}
}
class Asus_rog extends Asus_l
{

Asus_rog(String Product_name, String Model_name, double Product_price, String Product_color, int Model_year,
String Warranty)
{
super(Product_name, Model_name, Product_price, Product_color, Model_year, Warranty);

}
}
class Hp_l extends Laptop
{

Hp_l(String Product_name, String Model_name, double Product_price, String Product_color, int Model_year,
String Warranty)
{
super(Product_name, Model_name, Product_price, Product_color, Model_year, Warranty);

}
}//hp types
class Hp_i5 extends Hp_l
{

Hp_i5(String Product_name, String Model_name, double Product_price, String Product_color, int Model_year,
String Warranty)
{
super(Product_name, Model_name, Product_price, Product_color, Model_year, Warranty);

}
}
class Hp_ryzen extends Hp_l
{

Hp_ryzen(String Product_name, String Model_name, double Product_price, String Product_color, int Model_year,
String Warranty)
{
super(Product_name, Model_name, Product_price, Product_color, Model_year, Warranty);

}
}
class Dell_l extends Laptop
{

Dell_l(String Product_name, String Model_name, double Product_price, String Product_color, int Model_year,
String Warranty)
{
super(Product_name, Model_name, Product_price, Product_color, Model_year, Warranty);

}
}//dell typees
class Dell_core extends Dell_l
{

Dell_core(String Product_name, String Model_name, double Product_price, String Product_color, int Model_year,
String Warranty)
{
super(Product_name, Model_name, Product_price, Product_color, Model_year, Warranty);

}
}
class Dell_ryzen extends Dell_l
{

Dell_ryzen(String Product_name, String Model_name, double Product_price, String Product_color, int Model_year,
String Warranty)
{
super(Product_name, Model_name, Product_price, Product_color, Model_year, Warranty);

}
}
class Acer_l extends Laptop
{

Acer_l(String Product_name, String Model_name, double Product_price, String Product_color, int Model_year,
String Warranty)
{
super(Product_name, Model_name, Product_price, Product_color, Model_year, Warranty);

}
}// acer types
class Acer_core extends Acer_l
{

Acer_core(String Product_name, String Model_name, double Product_price, String Product_color, int Model_year,
String Warranty)
{
super(Product_name, Model_name, Product_price, Product_color, Model_year, Warranty);

}
}
class Acer_ryzen extends Acer_l
{

Acer_ryzen(String Product_name, String Model_name, double Product_price, String Product_color, int Model_year,
String Warranty)
{
super(Product_name, Model_name, Product_price, Product_color, Model_year, Warranty);

}
}
class Lenovo_l extends Laptop
{

Lenovo_l(String Product_name, String Model_name, double Product_price, String Product_color, int Model_year,
String Warranty)
{
super(Product_name, Model_name, Product_price, Product_color, Model_year, Warranty);

}
}//lenovo
class Lenovo_core extends Lenovo_l
{
Lenovo_core(String Product_name, String Model_name, double Product_price, String Product_color, int Model_year,
String Warranty)
{
super(Product_name, Model_name, Product_price, Product_color, Model_year, Warranty);

}
}
class Lenovo_ryzen extends Lenovo_l
{

Lenovo_ryzen(String Product_name, String Model_name, double Product_price, String Product_color, int Model_year,
String Warranty)
{
super(Product_name, Model_name, Product_price, Product_color, Model_year, Warranty);

}
}
class Apple_l extends Laptop
{

Apple_l(String Product_name, String Model_name, double Product_price, String Product_color, int Model_year,
String Warranty)
{
super(Product_name, Model_name, Product_price, Product_color, Model_year, Warranty);

}
}//apple types
class macbook extends Apple_l
{

macbook(String Product_name, String Model_name, double Product_price, String Product_color, int Model_year,
String Warranty)
{
super(Product_name, Model_name, Product_price, Product_color, Model_year, Warranty);

}
}
class macbook_pro extends Apple_l
{

macbook_pro(String Product_name, String Model_name, double Product_price, String Product_color, int Model_year,
String Warranty)
{
super(Product_name, Model_name, Product_price, Product_color, Model_year, Warranty);

}
}
class Realme_l extends Laptop
{

Realme_l(String Product_name, String Model_name, double Product_price, String Product_color, int Model_year,
String Warranty)
{
super(Product_name, Model_name, Product_price, Product_color, Model_year, Warranty);

}
}//Realme_l types
class Realme_core extends Realme_l
{

Realme_core(String Product_name, String Model_name, double Product_price, String Product_color, int Model_year,
String Warranty)
{
super(Product_name, Model_name, Product_price, Product_color, Model_year, Warranty);

}
}
class Realme_ryzen extends Realme_l
{

Realme_ryzen(String Product_name, String Model_name, double Product_price, String Product_color, int Model_year,
String Warranty)
{
super(Product_name, Model_name, Product_price, Product_color, Model_year, Warranty);

}
}
class Mobile extends Electric_store
{

Mobile(String Product_name, String Model_name, double Product_price, String Product_color, int Model_year,
String Warranty)
{
super(Product_name, Model_name, Product_price, Product_color, Model_year, Warranty);

}
}//types mobiles
class Realme_m extends  Mobile
{

Realme_m(String Product_name, String Model_name, double Product_price, String Product_color, int Model_year,
String Warranty)
{
super(Product_name, Model_name, Product_price, Product_color, Model_year, Warranty);

}
}
class Realme_narzo extends Realme_m
{

Realme_narzo(String Product_name, String Model_name, double Product_price, String Product_color, int Model_year,
String Warranty)
{
super(Product_name, Model_name, Product_price, Product_color, Model_year, Warranty);

}
}
class Realme_9_5g extends Realme_m
{

Realme_9_5g(String Product_name, String Model_name, double Product_price, String Product_color, int Model_year,
String Warranty)
{
super(Product_name, Model_name, Product_price, Product_color, Model_year, Warranty);

}
}
class Poco_m extends  Mobile
{

Poco_m(String Product_name, String Model_name, double Product_price, String Product_color, int Model_year,
String Warranty)
{
super(Product_name, Model_name, Product_price, Product_color, Model_year, Warranty);

}
}
class Poco_m5 extends Poco_m
{

Poco_m5(String Product_name, String Model_name, double Product_price, String Product_color, int Model_year,
String Warranty)
{
super(Product_name, Model_name, Product_price, Product_color, Model_year, Warranty);

}
}
class Poco_m4 extends Poco_m
{

Poco_m4(String Product_name, String Model_name, double Product_price, String Product_color, int Model_year,
String Warranty)
{
super(Product_name, Model_name, Product_price, Product_color, Model_year, Warranty);

}
}
class Apple_m extends Mobile
{

Apple_m(String Product_name, String Model_name, double Product_price, String Product_color, int Model_year,
String Warranty)
{
super(Product_name, Model_name, Product_price, Product_color, Model_year, Warranty);

}
}
class Apple_13 extends Apple_m
{

Apple_13(String Product_name, String Model_name, double Product_price, String Product_color, int Model_year,
String Warranty)
{
super(Product_name, Model_name, Product_price, Product_color, Model_year, Warranty);

}
}
class Apple_14 extends Apple_m
{

Apple_14(String Product_name, String Model_name, double Product_price, String Product_color, int Model_year,
String Warranty)
{
super(Product_name, Model_name, Product_price, Product_color, Model_year, Warranty);

}
}
class vivo_m extends  Mobile
{

vivo_m(String Product_name, String Model_name, double Product_price, String Product_color, int Model_year,
String Warranty)
{
super(Product_name, Model_name, Product_price, Product_color, Model_year, Warranty);

}
}
class vivo_v9 extends vivo_m
{

vivo_v9(String Product_name, String Model_name, double Product_price, String Product_color, int Model_year,
String Warranty)
{
super(Product_name, Model_name, Product_price, Product_color, Model_year, Warranty);

}
}
class vivo_v8 extends vivo_m
{

vivo_v8(String Product_name, String Model_name, double Product_price, String Product_color, int Model_year,
String Warranty)
{
super(Product_name, Model_name, Product_price, Product_color, Model_year, Warranty);

}
}
class Samsung_m extends  Mobile
{

Samsung_m(String Product_name, String Model_name, double Product_price, String Product_color, int Model_year,
String Warranty)
{
super(Product_name, Model_name, Product_price, Product_color, Model_year, Warranty);

}
}
class Samsung_fold extends Samsung_m
{

Samsung_fold(String Product_name, String Model_name, double Product_price, String Product_color, int Model_year,
String Warranty)
{
super(Product_name, Model_name, Product_price, Product_color, Model_year, Warranty);

}
}
class Samsung_folp extends Samsung_m
{

Samsung_folp(String Product_name, String Model_name, double Product_price, String Product_color, int Model_year,
String Warranty)
{
super(Product_name, Model_name, Product_price, Product_color, Model_year, Warranty);

}
}
class Mi_m extends  Mobile
{

Mi_m(String Product_name, String Model_name, double Product_price, String Product_color, int Model_year,
String Warranty)
{
super(Product_name, Model_name, Product_price, Product_color, Model_year, Warranty);

}
}
class Mi_11 extends Mi_m
{

Mi_11(String Product_name, String Model_name, double Product_price, String Product_color, int Model_year,
String Warranty)
{
super(Product_name, Model_name, Product_price, Product_color, Model_year, Warranty);

}
}
class Mi_10 extends Mi_m
{

Mi_10(String Product_name, String Model_name, double Product_price, String Product_color, int Model_year,
String Warranty)
{
super(Product_name, Model_name, Product_price, Product_color, Model_year, Warranty);

}
}
class smartWatch extends Electric_store
{

smartWatch(String Product_name, String Model_name, double Product_price, String Product_color, int Model_year,
String Warranty) {
super(Product_name, Model_name, Product_price, Product_color, Model_year, Warranty);

}
}
class NoiseW extends smartWatch
{

NoiseW(String Product_name, String Model_name, double Product_price, String Product_color, int Model_year,
String Warranty) {
super(Product_name, Model_name, Product_price, Product_color, Model_year, Warranty);

}
}
class NoiseColorfit extends NoiseW
{

NoiseColorfit(String Product_name, String Model_name, double Product_price, String Product_color, int Model_year,
String Warranty) {
super(Product_name, Model_name, Product_price, Product_color, Model_year, Warranty);

}
}
class NoiseVisionfit extends NoiseW
{

NoiseVisionfit(String Product_name, String Model_name, double Product_price, String Product_color, int Model_year,
String Warranty) {
super(Product_name, Model_name, Product_price, Product_color, Model_year, Warranty);

}
}
class BoatW extends smartWatch
{

BoatW(String Product_name, String Model_name, double Product_price, String Product_color, int Model_year,
String Warranty) {
super(Product_name, Model_name, Product_price, Product_color, Model_year, Warranty);

}
}
class BoatStorm extends BoatW
{

BoatStorm(String Product_name, String Model_name, double Product_price, String Product_color, int Model_year,
String Warranty) {
super(Product_name, Model_name, Product_price, Product_color, Model_year, Warranty);

}
}
class BoatStormCall extends BoatW
{

BoatStormCall(String Product_name, String Model_name, double Product_price, String Product_color, int Model_year,
String Warranty) {
super(Product_name, Model_name, Product_price, Product_color, Model_year, Warranty);

}
}
class SamsungW extends smartWatch
{

SamsungW(String Product_name, String Model_name, double Product_price, String Product_color, int Model_year,
String Warranty) {
super(Product_name, Model_name, Product_price, Product_color, Model_year, Warranty);

}
}
class SamsungGear extends SamsungW
{

SamsungGear(String Product_name, String Model_name, double Product_price, String Product_color, int Model_year,
String Warranty) {
super(Product_name, Model_name, Product_price, Product_color, Model_year, Warranty);

}
}
class SamsungWatch4 extends SamsungW
{

SamsungWatch4(String Product_name, String Model_name, double Product_price, String Product_color, int Model_year,
String Warranty) {
super(Product_name, Model_name, Product_price, Product_color, Model_year, Warranty);

}
}
class AppleW extends smartWatch
{

AppleW(String Product_name, String Model_name, double Product_price, String Product_color, int Model_year,
String Warranty) {
super(Product_name, Model_name, Product_price, Product_color, Model_year, Warranty);

}
}
class AppleSeries6 extends AppleW
{

AppleSeries6(String Product_name, String Model_name, double Product_price, String Product_color, int Model_year,
String Warranty) {
super(Product_name, Model_name, Product_price, Product_color, Model_year, Warranty);

}
}
class AppleUltra extends AppleW
{

AppleUltra(String Product_name, String Model_name, double Product_price, String Product_color, int Model_year,
String Warranty) {
super(Product_name, Model_name, Product_price, Product_color, Model_year, Warranty);

}
}
class FastrackW extends smartWatch
{

FastrackW(String Product_name, String Model_name, double Product_price, String Product_color, int Model_year,
String Warranty) {
super(Product_name, Model_name, Product_price, Product_color, Model_year, Warranty);

}
}
class FirebolttW extends smartWatch
{

FirebolttW(String Product_name, String Model_name, double Product_price, String Product_color, int Model_year,
String Warranty) {
super(Product_name, Model_name, Product_price, Product_color, Model_year, Warranty);

}
}
class Cameras extends smartWatch
{

Cameras(String Product_name, String Model_name, double Product_price, String Product_color, int Model_year,
String Warranty) {
super(Product_name, Model_name, Product_price, Product_color, Model_year, Warranty);

}
}
class Gopro extends  Cameras
{

Gopro(String Product_name, String Model_name, double Product_price, String Product_color, int Model_year,
String Warranty) {
super(Product_name, Model_name, Product_price, Product_color, Model_year, Warranty);

}
}
class Canon extends  Cameras
{

Canon(String Product_name, String Model_name, double Product_price, String Product_color, int Model_year,
String Warranty) {
super(Product_name, Model_name, Product_price, Product_color, Model_year, Warranty);

}
}
class Sony extends Cameras
{

Sony(String Product_name, String Model_name, double Product_price, String Product_color, int Model_year,
String Warranty) {
super(Product_name, Model_name, Product_price, Product_color, Model_year, Warranty);

}
}
class HiddenCamera extends  Cameras
{

HiddenCamera(String Product_name, String Model_name, double Product_price, String Product_color, int Model_year,
String Warranty) {
super(Product_name, Model_name, Product_price, Product_color, Model_year, Warranty);

}
}
class OfficeCamera extends  Cameras
{

OfficeCamera(String Product_name, String Model_name, double Product_price, String Product_color, int Model_year,
String Warranty) {
super(Product_name, Model_name, Product_price, Product_color, Model_year, Warranty);

}
}
class Sjcam extends  Cameras
{

Sjcam(String Product_name, String Model_name, double Product_price, String Product_color, int Model_year,
String Warranty) {
super(Product_name, Model_name, Product_price, Product_color, Model_year, Warranty);

}
}
class Campro extends  Cameras
{

Campro(String Product_name, String Model_name, double Product_price, String Product_color, int Model_year,
String Warranty) {
super(Product_name, Model_name, Product_price, Product_color, Model_year, Warranty);

}
}
public class Driver {

public static void main(String[] args) {
Electric_store ref=new Electric_store(null, null, 0, null, 0, null);
    System.out.println("==========================================================================");
System.out.println("|                    WELCOME TO PANDEY SHOWROOM                          |");
System.out.println("==========================================================================");
System.out.println("|                    COMPLETE YOUR REGISTRATION                          |");
Scanner sc=new Scanner(System.in);
        System.out.println("|------------------------------------------------------------------------|");
        System.out.println("|                   ===PLEASE ENTER YOUR NAME:===                        |");
        ref.setuserName(sc.next());
       
        System.out.println("|                  ===PLEASE ENTER YOUR NUMBER:===                       |");
        ref.setuserNo(sc.nextInt());
        System.out.println("|                      ===ENTER YOUR EMAIL:===                           |");
        ref.setuserMail(sc.next());
        System.out.println("|========================================================================|");
        System.out.println("                   ***REGISTERED SUCCESSFULLY***                          ");
        System.out.println("|========================================================================|");
        //USER INPUT
        System.out.println("|========================================================================|");
        System.out.println("                     WHAT WOULD YOU LIKE TO HAVE                         |");
        System.out.println("|=========================================================================");
        System.out.println("|                            HEADPHONE                                   |");
        System.out.println("|                             LAPTOP                                     |");
        System.out.println("|                             MOBILE                                     |");
        System.out.println("|                           SMARTWATCH                                   |");
        System.out.println("|                            CAMERAS                                     |");
       
       
        String n=sc.next();
        switch (n)
        {
        case "HEADPHONE":
        System.out.println("|=========================================================================|");
        System.out.println("               CHOOSE WHICH TYPE HEADPHONE YOU WANT"                        );
        System.out.println("|=========================================================================|");
        System.out.println("|                         BLUETOOTH                                       |");
        System.out.println("|                           WIRED                                         |");
        
 
        n=sc.next();
        switch (n)
        {
        case "WIRED":
        System.out.println("|=========================================================================|");
        System.out.println("|                        PLEASE CHOOSE BRAND                              |");
        System.out.println("|=========================================================================|");
        System.out.println("|                               APPLE                                     |");
           System.out.println("|                               BOAT                                      |");
           System.out.println("|                               JBL                                       |");
        System.out.println("|                              ONEPLUS                                    |");
        System.out.println("|                              SAMSUNG                                    |");
       
        n=sc.next();
        switch (n)
        {
        case "APPLE":
        Airpod aw=new Airpod("apple","earpod",500,"black",2022,"1year");
        System.out.println("                     "+aw.Product_name                   );
           System.out.println("                     "+aw.Model_name                     );
        System.out.println("                     "+aw.Product_price                  );
        System.out.println("                     "+aw.Product_color                  );
        System.out.println("                     "+aw.Warranty                       );
 
        //SWITCH FOR PAYMENT
System.out.println("         -- SELECT YOUR PAYMENT OPTION --                ");
System.out.println("=========================================================");
System.out.println("                       COD                               ");
System.out.println("                       UPI                               ");

n=sc.next();
switch(n)
{
case "UPI":

System.out.println("=========================================================");
System.out.println("                ENTER YOUR UPI ID:                       ");
n=sc.next();
System.out.println("                 CONFIRM_PAYMENT                         ");
System.out.println("                 CANCEL_PAYMENT                          ");
n=sc.next();
switch(n)
{
case "CONFIRM_PAYMENT":
System.out.println("  $$ CONGRATULATION,YOUR PAYMENT IS SUCCESSFUll $$   ");
System.out.println("       --- GREAT, ORDER SUCCESSFULLY PLACED ---      ");
   break;
case "CANCEL_PAYMENT":
System.out.println("          _____ PAYMENT IS DECLINED _____            ");
break;
default:System.out.println("invalid input");
                            }
return;
                    case "COD":
System.out.println("       --- GREAT, ORDER SUCCESSFULLY PLACED ---      ");
break;
}
return;

        case "BOAT":
        Boult_b bw=new Boult_b("boat","earpod",499,"white",2022,"1year");
        System.out.println("                     "+bw.Product_name               );
           System.out.println("                     "+bw.Model_name                 );
        System.out.println("                     "+bw.Product_price);
        System.out.println("                     "+bw.Product_color);
        System.out.println("                     "+bw.Warranty);
        //SWITCH FOR PAYMENT
System.out.println("         -- SELECT YOUR PAYMENT OPTION --                ");
System.out.println("=========================================================");
System.out.println("                       COD                               ");
System.out.println("                       UPI                               ");
        n=sc.next();
switch(n)
{
case "UPI":

System.out.println("=========================================================");
System.out.println("                ENTER YOUR UPI ID:                       ");
n=sc.next();
System.out.println("                 CONFIRM_PAYMENT                         ");
System.out.println("                 CANCEL_PAYMENT                          ");
n=sc.next();
switch(n)
{
case "CONFIRM_PAYMENT":
System.out.println("  $$ CONGRATULATION,YOUR PAYMENT IS SUCCESSFUll $$   ");
System.out.println("       --- GREAT, ORDER SUCCESSFULLY PLACED ---      ");
   break;
case "CANCEL_PAYMENT":
System.out.println("          _____ PAYMENT IS DECLINED _____            ");
break;
default:System.out.println("invalid input");
                            }
return;
                    case "COD":
System.out.println("       --- GREAT, ORDER SUCCESSFULLY PLACED ---      ");
break;
}
return;
       
       
        case "SAMSUNG":
        Samsung_b sw=new Samsung_b("samsung","earpod",599,"black;",2022,"1year");
        System.out.println("                     "+sw.Product_name);
           System.out.println("                     "+sw.Model_name);
        System.out.println("                     "+sw.Product_price);
        System.out.println("                     "+sw.Product_color);
        System.out.println("                     "+sw.Warranty);
        //SWITCH FOR PAYMENT
System.out.println("         -- SELECT YOUR PAYMENT OPTION --                ");
System.out.println("=========================================================");
System.out.println("                       COD                               ");
System.out.println("                       UPI                               ");
        n=sc.next();
switch(n)
{
case "UPI":

System.out.println("=========================================================");
System.out.println("                ENTER YOUR UPI ID:                       ");
n=sc.next();
System.out.println("                 CONFIRM_PAYMENT                         ");
System.out.println("                 CANCEL_PAYMENT                          ");
n=sc.next();
switch(n)
{
case "CONFIRM_PAYMENT":
System.out.println("  $$ CONGRATULATION,YOUR PAYMENT IS SUCCESSFUll $$   ");
System.out.println("       --- GREAT, ORDER SUCCESSFULLY PLACED ---      ");
   break;
case "CANCEL_PAYMENT":
System.out.println("          _____ PAYMENT IS DECLINED _____            ");
break;
default:System.out.println("invalid input");
                            }
return;
                    case "COD":
System.out.println("       --- GREAT, ORDER SUCCESSFULLY PLACED ---      ");
break;
}
return;
       
        case "JBL":
        JBL_b jw=new JBL_b ("jbl","earpod",599,"blue;",2022,"1year");
           System.out.println("                     "+jw.Product_name);
           System.out.println("                     "+jw.Model_name);
        System.out.println("                     "+jw.Product_price);
        System.out.println("                     "+jw.Product_color);
        System.out.println("                     "+jw.Warranty);
        //SWITCH FOR PAYMENT
System.out.println("         -- SELECT YOUR PAYMENT OPTION --                ");
System.out.println("=========================================================");
System.out.println("                       COD                               ");
System.out.println("                       UPI                               ");
        n=sc.next();
switch(n)
{
case "UPI":

System.out.println("=========================================================");
System.out.println("                ENTER YOUR UPI ID:                       ");
n=sc.next();
System.out.println("                 CONFIRM_PAYMENT                         ");
System.out.println("                 CANCEL_PAYMENT                          ");
n=sc.next();
switch(n)
{
case "CONFIRM_PAYMENT":
System.out.println("  $$ CONGRATULATION,YOUR PAYMENT IS SUCCESSFUll $$   ");
System.out.println("       --- GREAT, ORDER SUCCESSFULLY PLACED ---      ");
   break;
case "CANCEL_PAYMENT":
System.out.println("          _____ PAYMENT IS DECLINED _____            ");
break;
default:System.out.println("invalid input");
                            }
return;
                    case "COD":
System.out.println("       --- GREAT, ORDER SUCCESSFULLY PLACED ---      ");
break;
}
return;
       
        default:System.out.println("invalid input");
       
        }
        return;
       
        case "BLUETOOTH":
           System.out.println("--------------PLEASE CHOOSE BRAND-------------");
           System.out.println("                      APPLE");
           System.out.println("                      BOAT");
           System.out.println("                      JBL");
        System.out.println("                     ONEPLUS");
        System.out.println("                     SAMSUNG");
         
        n=sc.next();
            switch (n)
            {
            case "APPLE":

                System.out.println("               AIRPOD");
                System.out.println("             AIRPODPRO");
               
                  n=sc.next();
                  switch(n)
                  {
                  case "AIRPOD":
                  Airpod ab=new Airpod("apple","airpod",25000,"white",2022,"1year");
                  System.out.println("                     "+ab.Product_name);
               System.out.println("                     "+ab.Model_name);
            System.out.println("                     "+ab.Product_price);
            System.out.println("                     "+ab.Product_color);
            System.out.println("                     "+ab.Warranty);
            //SWITCH FOR PAYMENT
    System.out.println("         -- SELECT YOUR PAYMENT OPTION --                ");
    System.out.println("=========================================================");
    System.out.println("                       COD                               ");
    System.out.println("                       UPI                               ");
            n=sc.next();
    switch(n)
    {
    case "UPI":
   
    System.out.println("=========================================================");
    System.out.println("                ENTER YOUR UPI ID:                       ");
    n=sc.next();
    System.out.println("                 CONFIRM_PAYMENT                         ");
    System.out.println("                 CANCEL_PAYMENT                          ");
    n=sc.next();
    switch(n)
    {
    case "CONFIRM_PAYMENT":
    System.out.println("  $$ CONGRATULATION,YOUR PAYMENT IS SUCCESSFUll $$   ");
    System.out.println("       --- GREAT, ORDER SUCCESSFULLY PLACED ---      ");
       break;
    case "CANCEL_PAYMENT":
    System.out.println("          _____ PAYMENT IS DECLINED _____            ");
    break;
    default:System.out.println("invalid input");
                                }
    return;
                        case "COD":
    System.out.println("       --- GREAT, ORDER SUCCESSFULLY PLACED ---      ");
    break;
    }
    return;
                  case "AIRPODPRO":
                  Airpod_pro apb=new Airpod_pro("apple","airpodpro",29000,"white",2022,"1year");
                  System.out.println("                     "+apb.Product_name);
               System.out.println("                     "+apb.Model_name);
            System.out.println("                     "+apb.Product_price);
            System.out.println("                     "+apb.Product_color);
            System.out.println("                     "+apb.Warranty);
            //SWITCH FOR PAYMENT
    System.out.println("         -- SELECT YOUR PAYMENT OPTION --                ");
    System.out.println("=========================================================");
    System.out.println("                       COD                               ");
    System.out.println("                       UPI                               ");
            n=sc.next();
    switch(n)
    {
    case "UPI":
   
    System.out.println("=========================================================");
    System.out.println("                ENTER YOUR UPI ID:                       ");
    n=sc.next();
    System.out.println("                 CONFIRM_PAYMENT                         ");
    System.out.println("                 CANCEL_PAYMENT                          ");
    n=sc.next();
    switch(n)
    {
    case "CONFIRM_PAYMENT":
    System.out.println("  $$ CONGRATULATION,YOUR PAYMENT IS SUCCESSFUll $$   ");
    System.out.println("       --- GREAT, ORDER SUCCESSFULLY PLACED ---      ");
       break;
    case "CANCEL_PAYMENT":
    System.out.println("          _____ PAYMENT IS DECLINED _____            ");
    break;
    default:System.out.println("invalid input");
                                }
    return;
                        case "COD":
    System.out.println("       --- GREAT, ORDER SUCCESSFULLY PLACED ---      ");
    break;
    }
    return;
                  default:System.out.println("invalid input");
           
                  }
                  return;
        case "BOAT":
        System.out.println("                    NECKBAND");
                System.out.println("                      BUDS");
               
                  n=sc.next();
                  switch(n)
                  {
                  case "NECKBAND":
                  Boat_neckband bb=new Boat_neckband("boat","neckband",2000,"black",2022,"1year");
                  System.out.println("                     "+bb.Product_name);
               System.out.println("                     "+bb.Model_name);
            System.out.println("                     "+bb.Product_price);
            System.out.println("                     "+bb.Product_color);
            System.out.println("                     "+bb.Warranty);
            //SWITCH FOR PAYMENT
    System.out.println("         -- SELECT YOUR PAYMENT OPTION --                ");
    System.out.println("=========================================================");
    System.out.println("                       COD                               ");
    System.out.println("                       UPI                               ");
            n=sc.next();
    switch(n)
    {
    case "UPI":
   
    System.out.println("=========================================================");
    System.out.println("                ENTER YOUR UPI ID:                       ");
    n=sc.next();
    System.out.println("                 CONFIRM_PAYMENT                         ");
    System.out.println("                 CANCEL_PAYMENT                          ");
    n=sc.next();
    switch(n)
    {
    case "CONFIRM_PAYMENT":
    System.out.println("  $$ CONGRATULATION,YOUR PAYMENT IS SUCCESSFUll $$   ");
    System.out.println("       --- GREAT, ORDER SUCCESSFULLY PLACED ---      ");
       break;
    case "CANCEL_PAYMENT":
    System.out.println("          _____ PAYMENT IS DECLINED _____            ");
    break;
    default:System.out.println("invalid input");
                                }
    return;
                        case "COD":
    System.out.println("       --- GREAT, ORDER SUCCESSFULLY PLACED ---      ");
    break;
    }
    return;
                  case "BUDS":
                  Boat_buds bbb=new Boat_buds("boat","buds",2500,"red",2022,"1year");
                  System.out.println("                     "+bbb.Product_name);
               System.out.println("                     "+bbb.Model_name);
            System.out.println("                     "+bbb.Product_price);
            System.out.println("                     "+bbb.Product_color);
            System.out.println("                     "+bbb.Warranty);
            //SWITCH FOR PAYMENT
    System.out.println("         -- SELECT YOUR PAYMENT OPTION --                ");
    System.out.println("=========================================================");
    System.out.println("                       COD                               ");
    System.out.println("                       UPI                               ");
            n=sc.next();
    switch(n)
    {
    case "UPI":
   
    System.out.println("=========================================================");
    System.out.println("                ENTER YOUR UPI ID:                       ");
    n=sc.next();
    System.out.println("                 CONFIRM_PAYMENT                         ");
    System.out.println("                 CANCEL_PAYMENT                          ");
    n=sc.next();
    switch(n)
    {
    case "CONFIRM_PAYMENT":
    System.out.println("  $$ CONGRATULATION,YOUR PAYMENT IS SUCCESSFUll $$   ");
    System.out.println("       --- GREAT, ORDER SUCCESSFULLY PLACED ---      ");
       break;
    case "CANCEL_PAYMENT":
    System.out.println("          _____ PAYMENT IS DECLINED _____            ");
    break;
    default:System.out.println("invalid input");
                                }
    return;
                        case "COD":
    System.out.println("       --- GREAT, ORDER SUCCESSFULLY PLACED ---      ");
    break;
    }
    return;
                  default:System.out.println("invalid input");
           
                  }
                  return;
                 
                case "JBL":
                System.out.println("                 NECKBAND");
                System.out.println("                   BUDS");
               
                  n=sc.next();
                  switch(n)
                  {
                  case "NECKBAND":
                  JBL_neckband jb=new JBL_neckband("jbl","neckband",2900,"blue",2022,"1year");
                  System.out.println("                     "+jb.Product_name);
               System.out.println("                     "+jb.Model_name);
            System.out.println("                     "+jb.Product_price);
            System.out.println("                     "+jb.Product_color);
            System.out.println("                     "+jb.Warranty);
            //SWITCH FOR PAYMENT
    System.out.println("         -- SELECT YOUR PAYMENT OPTION --                ");
    System.out.println("=========================================================");
    System.out.println("                       COD                               ");
    System.out.println("                       UPI                               ");
            n=sc.next();
    switch(n)
    {
    case "UPI":
   
    System.out.println("=========================================================");
    System.out.println("                ENTER YOUR UPI ID:                       ");
    n=sc.next();
    System.out.println("                 CONFIRM_PAYMENT                         ");
    System.out.println("                 CANCEL_PAYMENT                          ");
    n=sc.next();
    switch(n)
    {
    case "CONFIRM_PAYMENT":
    System.out.println("  $$ CONGRATULATION,YOUR PAYMENT IS SUCCESSFUll $$   ");
    System.out.println("       --- GREAT, ORDER SUCCESSFULLY PLACED ---      ");
       break;
    case "CANCEL_PAYMENT":
    System.out.println("          _____ PAYMENT IS DECLINED _____            ");
    break;
    default:System.out.println("invalid input");
                                }
    return;
                        case "COD":
    System.out.println("       --- GREAT, ORDER SUCCESSFULLY PLACED ---      ");
    break;
    }
    return;
                  case "BUDS":
                  JBL_buds jbb=new JBL_buds("jbl","buds",2990,"blue",2022,"1year");
                  System.out.println("                     "+jbb.Product_name);
               System.out.println("                     "+jbb.Model_name);
            System.out.println("                     "+jbb.Product_price);
            System.out.println("                     "+jbb.Product_color);
            System.out.println("                     "+jbb.Warranty);
            //SWITCH FOR PAYMENT
    System.out.println("         -- SELECT YOUR PAYMENT OPTION --                ");
    System.out.println("=========================================================");
    System.out.println("                       COD                               ");
    System.out.println("                       UPI                               ");
            n=sc.next();
    switch(n)
    {
    case "UPI":
   
    System.out.println("=========================================================");
    System.out.println("                ENTER YOUR UPI ID:                       ");
    n=sc.next();
    System.out.println("                 CONFIRM_PAYMENT                         ");
    System.out.println("                 CANCEL_PAYMENT                          ");
    n=sc.next();
    switch(n)
    {
    case "CONFIRM_PAYMENT":
    System.out.println("  $$ CONGRATULATION,YOUR PAYMENT IS SUCCESSFUll $$   ");
    System.out.println("       --- GREAT, ORDER SUCCESSFULLY PLACED ---      ");
       break;
    case "CANCEL_PAYMENT":
    System.out.println("          _____ PAYMENT IS DECLINED _____            ");
    break;
    default:System.out.println("invalid input");
                                }
    return;
                        case "COD":
    System.out.println("       --- GREAT, ORDER SUCCESSFULLY PLACED ---      ");
    break;
    }
    return;
                 
                  }
                  return;
                 
        case "SAMSUNG":
        System.out.println("                  NECKBAND");
                System.out.println("                    BUDS");
               
                  n=sc.next();
                  switch(n)
                  {
                  case "NECKBAND":
                  Samsung_levelU2 sb=new Samsung_levelU2("samsung","levelu2",3900,"grey",2022,"1year");
                  System.out.println("                     "+sb.Product_name);
               System.out.println("                     "+sb.Model_name);
            System.out.println("                     "+sb.Product_price);
            System.out.println("                     "+sb.Product_color);
            System.out.println("                     "+sb.Warranty);
            n=sc.next();
            //SWITCH FOR PAYMENT
    System.out.println("         -- SELECT YOUR PAYMENT OPTION --                ");
    System.out.println("=========================================================");
    System.out.println("                       COD                               ");
    System.out.println("                       UPI                               ");
    switch(n)
    {
    case "UPI":
   
    System.out.println("=========================================================");
    System.out.println("                ENTER YOUR UPI ID:                       ");
    n=sc.next();
    System.out.println("                 CONFIRM_PAYMENT                         ");
    System.out.println("                 CANCEL_PAYMENT                          ");
    n=sc.next();
    switch(n)
    {
    case "CONFIRM_PAYMENT":
    System.out.println("  $$ CONGRATULATION,YOUR PAYMENT IS SUCCESSFUll $$   ");
    System.out.println("       --- GREAT, ORDER SUCCESSFULLY PLACED ---      ");
       break;
    case "CANCEL_PAYMENT":
    System.out.println("          _____ PAYMENT IS DECLINED _____            ");
    break;
    default:System.out.println("invalid input");
                                }
    return;
                        case "COD":
    System.out.println("       --- GREAT, ORDER SUCCESSFULLY PLACED ---      ");
    break;
    }
    return;
                  case "BUDS":
                  Samsung_buds sbb=new Samsung_buds("samsung","buds",13900,"grey",2022,"1year");
                  System.out.println("                     "+sbb.Product_name);
               System.out.println("                     "+sbb.Model_name);
            System.out.println("                     "+sbb.Product_price);
            System.out.println("                     "+sbb.Product_color);
            System.out.println("                     "+sbb.Warranty);
            n=sc.next();
            //SWITCH FOR PAYMENT
    System.out.println("         -- SELECT YOUR PAYMENT OPTION --                ");
    System.out.println("=========================================================");
    System.out.println("                       COD                               ");
    System.out.println("                       UPI                               ");
    switch(n)
    {
    case "UPI":
   
    System.out.println("=========================================================");
    System.out.println("                ENTER YOUR UPI ID:                       ");
    n=sc.next();
    System.out.println("                 CONFIRM_PAYMENT                         ");
    System.out.println("                 CANCEL_PAYMENT                          ");
    n=sc.next();
    switch(n)
    {
    case "CONFIRM_PAYMENT":
    System.out.println("  $$ CONGRATULATION,YOUR PAYMENT IS SUCCESSFUll $$   ");
    System.out.println("       --- GREAT, ORDER SUCCESSFULLY PLACED ---      ");
       break;
    case "CANCEL_PAYMENT":
    System.out.println("          _____ PAYMENT IS DECLINED _____            ");
    break;
    default:System.out.println("invalid input");
                                }
    return;
                        case "COD":
    System.out.println("       --- GREAT, ORDER SUCCESSFULLY PLACED ---      ");
    break;
    }
    return;
                                 
                  }
                  return;
              default:System.out.println("invalid input");
        }
            return;
        }
           
            //switch statement for laptop
        case "LAPTOP":
        System.out.println("--------------CHOOSE BRAND FOR YOUR LAPTOP----------");
        System.out.println("                          ASUS");
        System.out.println("                           HP");
        System.out.println("                          DELL");
        System.out.println("                          ACER");
        System.out.println("                         LENOVO");
        System.out.println("                          APPLE");
        System.out.println("                         REALME");
       
        n=sc.next();
        switch(n)
        {
        case "ASUS":
        System.out.println("CHOOSE TYPE OF LAPTOP");
        System.out.println("ASUS_GAMING");
        System.out.println("ASUS_ROG");
       
        n=sc.next();
        switch (n)
        {
        case "ASUS_GAMING":
        Asus_gaming al=new Asus_gaming("ASUS","gaming",49900,"silver",2022,"1year");
        System.out.println(             al.Product_name);
               System.out.println(             al.Model_name);
            System.out.println(             al.Product_price);
            System.out.println(             al.Product_color);
            System.out.println(             al.Warranty);
            //SWITCH FOR PAYMENT
    System.out.println("         -- SELECT YOUR PAYMENT OPTION --                ");
    System.out.println("=========================================================");
    System.out.println("                       COD                               ");
    System.out.println("                       UPI                               ");
            n=sc.next();
    switch(n)
    {
    case "UPI":
   
    System.out.println("=========================================================");
    System.out.println("                ENTER YOUR UPI ID:                       ");
    n=sc.next();
    System.out.println("                 CONFIRM_PAYMENT                         ");
    System.out.println("                 CANCEL_PAYMENT                          ");
    n=sc.next();
    switch(n)
    {
    case "CONFIRM_PAYMENT":
    System.out.println("  $$ CONGRATULATION,YOUR PAYMENT IS SUCCESSFUll $$   ");
    System.out.println("       --- GREAT, ORDER SUCCESSFULLY PLACED ---      ");
       break;
    case "CANCEL_PAYMENT":
    System.out.println("          _____ PAYMENT IS DECLINED _____            ");
    break;
    default:System.out.println("invalid input");
                                }
    return;
                        case "COD":
    System.out.println("       --- GREAT, ORDER SUCCESSFULLY PLACED ---      ");
    break;
    }
    return;
        case "ASUS_ROG":
        Asus_rog arl=new Asus_rog("ASUS","ROG",39999,"grey",2022,"1year");
        System.out.println(             arl.Product_name);
               System.out.println(             arl.Model_name);
            System.out.println(             arl.Product_price);
            System.out.println(             arl.Product_color);
            System.out.println(             arl.Warranty);
            //SWITCH FOR PAYMENT
    System.out.println("         -- SELECT YOUR PAYMENT OPTION --                ");
    System.out.println("=========================================================");
    System.out.println("                       COD                               ");
    System.out.println("                       UPI                               ");
            n=sc.next();
    switch(n)
    {
    case "UPI":
   
    System.out.println("=========================================================");
    System.out.println("                ENTER YOUR UPI ID:                       ");
    n=sc.next();
    System.out.println("                 CONFIRM_PAYMENT                         ");
    System.out.println("                 CANCEL_PAYMENT                          ");
    n=sc.next();
    switch(n)
    {
    case "CONFIRM_PAYMENT":
    System.out.println("  $$ CONGRATULATION,YOUR PAYMENT IS SUCCESSFUll $$   ");
    System.out.println("       --- GREAT, ORDER SUCCESSFULLY PLACED ---      ");
       break;
    case "CANCEL_PAYMENT":
    System.out.println("          _____ PAYMENT IS DECLINED _____            ");
    break;
    default:System.out.println("invalid input");
                                }
    return;
                        case "COD":
    System.out.println("       --- GREAT, ORDER SUCCESSFULLY PLACED ---      ");
    break;
    }
    return;
        default:System.out.println("invalid input");
       
        }
        return;
       
        case "HP":
        System.out.println("CHOOSE TYPE OF LAPTOP");
        System.out.println("HPi5");
        System.out.println("HPRYZEN");
       
        n=sc.next();
        switch(n)
        {
        case  "HPi5":
        Hp_ryzen hl=new Hp_ryzen("HP","i5",38000,"silver",2022,"1year");
        System.out.println(          hl.Product_name);
               System.out.println(          hl.Model_name);
            System.out.println(          hl.Product_price);
            System.out.println(          hl.Product_color);
            System.out.println(          hl.Warranty);
            //SWITCH FOR PAYMENT
    System.out.println("         -- SELECT YOUR PAYMENT OPTION --                ");
    System.out.println("=========================================================");
    System.out.println("                       COD                               ");
    System.out.println("                       UPI                               ");
            n=sc.next();
    switch(n)
    {
    case "UPI":
   
    System.out.println("=========================================================");
    System.out.println("                ENTER YOUR UPI ID:                       ");
    n=sc.next();
    System.out.println("                 CONFIRM_PAYMENT                         ");
    System.out.println("                 CANCEL_PAYMENT                          ");
    n=sc.next();
    switch(n)
    {
    case "CONFIRM_PAYMENT":
    System.out.println("  $$ CONGRATULATION,YOUR PAYMENT IS SUCCESSFUll $$   ");
    System.out.println("       --- GREAT, ORDER SUCCESSFULLY PLACED ---      ");
       break;
    case "CANCEL_PAYMENT":
    System.out.println("          _____ PAYMENT IS DECLINED _____            ");
    break;
    default:System.out.println("invalid input");
                                }
    return;
                        case "COD":
    System.out.println("       --- GREAT, ORDER SUCCESSFULLY PLACED ---      ");
    break;
    }
    return;
        case "HPRYZEN":
        Hp_ryzen hrl=new Hp_ryzen("HP","rygen",48000,"grey",2022,"1year");
        System.out.println(           hrl.Product_name);
               System.out.println(           hrl.Model_name);
            System.out.println(           hrl.Product_price);
            System.out.println(           hrl.Product_color);
            System.out.println(           hrl.Warranty);
            //SWITCH FOR PAYMENT
    System.out.println("         -- SELECT YOUR PAYMENT OPTION --                ");
    System.out.println("=========================================================");
    System.out.println("                       COD                               ");
    System.out.println("                       UPI                               ");
            n=sc.next();
    switch(n)
    {
    case "UPI":
   
    System.out.println("=========================================================");
    System.out.println("                ENTER YOUR UPI ID:                       ");
    n=sc.next();
    System.out.println("                 CONFIRM_PAYMENT                         ");
    System.out.println("                 CANCEL_PAYMENT                          ");
    n=sc.next();
    switch(n)
    {
    case "CONFIRM_PAYMENT":
    System.out.println("  $$ CONGRATULATION,YOUR PAYMENT IS SUCCESSFUll $$   ");
    System.out.println("       --- GREAT, ORDER SUCCESSFULLY PLACED ---      ");
       break;
    case "CANCEL_PAYMENT":
    System.out.println("          _____ PAYMENT IS DECLINED _____            ");
    break;
    default:System.out.println("invalid input");
                                }
    return;
                        case "COD":
    System.out.println("       --- GREAT, ORDER SUCCESSFULLY PLACED ---      ");
    break;
    }
    return;
        default:System.out.println("invalid input");
       
        }
        return;
       
        case "DELL":
        System.out.println("CHOOSE TYPE OF LAPTOP");
        System.out.println("DELL_CORE");
        System.out.println("DELL_RYGEN");
       
        n=sc.next();
        switch(n)
        {
        case "DELL_CORE":
        Dell_core dl=new Dell_core("dell","core",48000,"grey",2022,"1year");
        System.out.println(           dl.Product_name);
               System.out.println(           dl.Model_name);
            System.out.println(           dl.Product_price);
            System.out.println(           dl.Product_color);
            System.out.println(           dl.Warranty);
            //SWITCH FOR PAYMENT
    System.out.println("         -- SELECT YOUR PAYMENT OPTION --                ");
    System.out.println("=========================================================");
    System.out.println("                       COD                               ");
    System.out.println("                       UPI                               ");
            n=sc.next();
    switch(n)
    {
    case "UPI":
   
    System.out.println("=========================================================");
    System.out.println("                ENTER YOUR UPI ID:                       ");
    n=sc.next();
    System.out.println("                 CONFIRM_PAYMENT                         ");
    System.out.println("                 CANCEL_PAYMENT                          ");
    n=sc.next();
    switch(n)
    {
    case "CONFIRM_PAYMENT":
    System.out.println("  $$ CONGRATULATION,YOUR PAYMENT IS SUCCESSFUll $$   ");
    System.out.println("       --- GREAT, ORDER SUCCESSFULLY PLACED ---      ");
       break;
    case "CANCEL_PAYMENT":
    System.out.println("          _____ PAYMENT IS DECLINED _____            ");
    break;
    default:System.out.println("invalid input");
                                }
    return;
                        case "COD":
    System.out.println("       --- GREAT, ORDER SUCCESSFULLY PLACED ---      ");
    break;
    }
    return;
        case "DELL_RYGEN":
        Dell_ryzen drl=new Dell_ryzen("dell","ryzen",48000,"grey",2022,"1year");
        System.out.println(          drl.Product_name);
               System.out.println(          drl.Model_name);
            System.out.println(          drl.Product_price);
            System.out.println(          drl.Product_color);
            System.out.println(          drl.Warranty);
            //SWITCH FOR PAYMENT
    System.out.println("         -- SELECT YOUR PAYMENT OPTION --                ");
    System.out.println("=========================================================");
    System.out.println("                       COD                               ");
    System.out.println("                       UPI                               ");
            n=sc.next();
    switch(n)
    {
    case "UPI":
   
    System.out.println("=========================================================");
    System.out.println("                ENTER YOUR UPI ID:                       ");
    n=sc.next();
    System.out.println("                 CONFIRM_PAYMENT                         ");
    System.out.println("                 CANCEL_PAYMENT                          ");
    n=sc.next();
    switch(n)
    {
    case "CONFIRM_PAYMENT":
    System.out.println("  $$ CONGRATULATION,YOUR PAYMENT IS SUCCESSFUll $$   ");
    System.out.println("       --- GREAT, ORDER SUCCESSFULLY PLACED ---      ");
       break;
    case "CANCEL_PAYMENT":
    System.out.println("          _____ PAYMENT IS DECLINED _____            ");
    break;
    default:System.out.println("invalid input");
                                }
    return;
                        case "COD":
    System.out.println("       --- GREAT, ORDER SUCCESSFULLY PLACED ---      ");
    break;
    }
    return;
        default:System.out.println("invalid input");
       
        }
        return;
       
        case "LENOVO":
        System.out.println("CHOOSE TYPE OF LAPTOP");
        System.out.println("LENOVO_CORE");
        System.out.println("LENOVO_RYGEN");
       
        n=sc.next();
        switch(n)
        {
        case "LENOVO_CORE":
        Lenovo_core ll=new Lenovo_core("lenovo","core",48000,"grey",2022,"1year");
        System.out.println(          ll.Product_name);
               System.out.println(          ll.Model_name);
            System.out.println(          ll.Product_price);
            System.out.println(          ll.Product_color);
            System.out.println(          ll.Warranty);
            //SWITCH FOR PAYMENT
    System.out.println("         -- SELECT YOUR PAYMENT OPTION --                ");
    System.out.println("=========================================================");
    System.out.println("                       COD                               ");
    System.out.println("                       UPI                               ");
            n=sc.next();
    switch(n)
    {
    case "UPI":
   
    System.out.println("=========================================================");
    System.out.println("                ENTER YOUR UPI ID:                       ");
    n=sc.next();
    System.out.println("                 CONFIRM_PAYMENT                         ");
    System.out.println("                 CANCEL_PAYMENT                          ");
    n=sc.next();
    switch(n)
    {
    case "CONFIRM_PAYMENT":
    System.out.println("  $$ CONGRATULATION,YOUR PAYMENT IS SUCCESSFUll $$   ");
    System.out.println("       --- GREAT, ORDER SUCCESSFULLY PLACED ---      ");
       break;
    case "CANCEL_PAYMENT":
    System.out.println("          _____ PAYMENT IS DECLINED _____            ");
    break;
    default:System.out.println("invalid input");
                                }
    return;
                        case "COD":
    System.out.println("       --- GREAT, ORDER SUCCESSFULLY PLACED ---      ");
    break;
    }
    return;
        case "LENOVO_RYGEN":
        Lenovo_core lrl=new Lenovo_core("lenovo","core",48000,"grey",2022,"1year");
        System.out.println(          lrl.Product_name);
               System.out.println(          lrl.Model_name);
            System.out.println(          lrl.Product_price);
            System.out.println(          lrl.Product_color);
            System.out.println(          lrl.Warranty);
            //SWITCH FOR PAYMENT
    System.out.println("         -- SELECT YOUR PAYMENT OPTION --                ");
    System.out.println("=========================================================");
    System.out.println("                       COD                               ");
    System.out.println("                       UPI                               ");
            n=sc.next();
    switch(n)
    {
    case "UPI":
   
    System.out.println("=========================================================");
    System.out.println("                ENTER YOUR UPI ID:                       ");
    n=sc.next();
    System.out.println("                 CONFIRM_PAYMENT                         ");
    System.out.println("                 CANCEL_PAYMENT                          ");
    n=sc.next();
    switch(n)
    {
    case "CONFIRM_PAYMENT":
    System.out.println("  $$ CONGRATULATION,YOUR PAYMENT IS SUCCESSFUll $$   ");
    System.out.println("       --- GREAT, ORDER SUCCESSFULLY PLACED ---      ");
       break;
    case "CANCEL_PAYMENT":
    System.out.println("          _____ PAYMENT IS DECLINED _____            ");
    break;
    default:System.out.println("invalid input");
                                }
    return;
                        case "COD":
    System.out.println("       --- GREAT, ORDER SUCCESSFULLY PLACED ---      ");
    break;
    }
    return;
        default:System.out.println("invalid input");

        }
        return;
       
        case "APPLE":
        System.out.println("CHOOSE TYPE OF LAPTOP");
        System.out.println("MACBOOK");
        System.out.println("MACBOOK_PRO");
       
        n=sc.next();
        switch(n)
        {
        case "MACBOOK":
        macbook ml=new macbook("apple","macbook",148000,"grey",2022,"1year");
        System.out.println(            ml.Product_name);
               System.out.println(            ml.Model_name);
            System.out.println(            ml.Product_price);
            System.out.println(            ml.Product_color);
            System.out.println(            ml.Warranty);
            //SWITCH FOR PAYMENT
    System.out.println("         -- SELECT YOUR PAYMENT OPTION --                ");
    System.out.println("=========================================================");
    System.out.println("                       COD                               ");
    System.out.println("                       UPI                               ");
            n=sc.next();
    switch(n)
    {
    case "UPI":
   
    System.out.println("=========================================================");
    System.out.println("                ENTER YOUR UPI ID:                       ");
    n=sc.next();
    System.out.println("                 CONFIRM_PAYMENT                         ");
    System.out.println("                 CANCEL_PAYMENT                          ");
    n=sc.next();
    switch(n)
    {
    case "CONFIRM_PAYMENT":
    System.out.println("  $$ CONGRATULATION,YOUR PAYMENT IS SUCCESSFUll $$   ");
    System.out.println("       --- GREAT, ORDER SUCCESSFULLY PLACED ---      ");
       break;
    case "CANCEL_PAYMENT":
    System.out.println("          _____ PAYMENT IS DECLINED _____            ");
    break;
    default:System.out.println("invalid input");
                                }
    return;
                        case "COD":
    System.out.println("       --- GREAT, ORDER SUCCESSFULLY PLACED ---      ");
    break;
    }
    return;
        case "MACBOOK_pro":
        macbook_pro mpl=new macbook_pro("apple","macbookpro",198000,"grey",2022,"1year");
        System.out.println(          mpl.Product_name);
               System.out.println(          mpl.Model_name);
            System.out.println(          mpl.Product_price);
            System.out.println(          mpl.Product_color);
            System.out.println(          mpl.Warranty);
            //SWITCH FOR PAYMENT
    System.out.println("         -- SELECT YOUR PAYMENT OPTION --                ");
    System.out.println("=========================================================");
    System.out.println("                       COD                               ");
    System.out.println("                       UPI                               ");
            n=sc.next();
    switch(n)
    {
    case "UPI":
   
    System.out.println("=========================================================");
    System.out.println("                ENTER YOUR UPI ID:                       ");
    n=sc.next();
    System.out.println("                 CONFIRM_PAYMENT                         ");
    System.out.println("                 CANCEL_PAYMENT                          ");
    n=sc.next();
    switch(n)
    {
    case "CONFIRM_PAYMENT":
    System.out.println("  $$ CONGRATULATION,YOUR PAYMENT IS SUCCESSFUll $$   ");
    System.out.println("       --- GREAT, ORDER SUCCESSFULLY PLACED ---      ");
       break;
    case "CANCEL_PAYMENT":
    System.out.println("          _____ PAYMENT IS DECLINED _____            ");
    break;
    default:System.out.println("invalid input");
                                }
    return;
                        case "COD":
    System.out.println("       --- GREAT, ORDER SUCCESSFULLY PLACED ---      ");
    break;
    }
    return;
        default:System.out.println("invalid input");
        }
        return;
       
        case "REALME":
        System.out.println("CHOOSE TYPE OF LAPTOP");
        System.out.println("core");
        System.out.println("ryzen");
        n=sc.next();
           switch(n)
           {
           case "core":
            Realme_core rl=new Realme_core("realme","core",35000,"grey",2022,"1year");
        System.out.println(          rl.Product_name);
               System.out.println(          rl.Model_name);
            System.out.println(          rl.Product_price);
            System.out.println(          rl.Product_color);
            System.out.println(          rl.Warranty);
            //SWITCH FOR PAYMENT
    System.out.println("         -- SELECT YOUR PAYMENT OPTION --                ");
    System.out.println("=========================================================");
    System.out.println("                       COD                               ");
    System.out.println("                       UPI                               ");
            n=sc.next();
    switch(n)
    {
    case "UPI":
   
    System.out.println("=========================================================");
    System.out.println("                ENTER YOUR UPI ID:                       ");
    n=sc.next();
    System.out.println("                 CONFIRM_PAYMENT                         ");
    System.out.println("                 CANCEL_PAYMENT                          ");
    n=sc.next();
    switch(n)
    {
    case "CONFIRM_PAYMENT":
    System.out.println("  $$ CONGRATULATION,YOUR PAYMENT IS SUCCESSFUll $$   ");
    System.out.println("       --- GREAT, ORDER SUCCESSFULLY PLACED ---      ");
       break;
    case "CANCEL_PAYMENT":
    System.out.println("          _____ PAYMENT IS DECLINED _____            ");
    break;
    default:System.out.println("invalid input");
                                }
    return;
                        case "COD":
    System.out.println("       --- GREAT, ORDER SUCCESSFULLY PLACED ---      ");
    break;
    }
    return;
           case "ryzen":
            Realme_ryzen rrl=new Realme_ryzen("realme","ryzen",30000,"grey",2022,"1year");
        System.out.println(          rrl.Product_name);
               System.out.println(          rrl.Model_name);
            System.out.println(          rrl.Product_price);
            System.out.println(          rrl.Product_color);
            System.out.println(          rrl.Warranty);
            //SWITCH FOR PAYMENT
    System.out.println("         -- SELECT YOUR PAYMENT OPTION --                ");
    System.out.println("=========================================================");
    System.out.println("                       COD                               ");
    System.out.println("                       UPI                               ");
            n=sc.next();
    switch(n)
    {
    case "UPI":
   
    System.out.println("=========================================================");
    System.out.println("                ENTER YOUR UPI ID:                       ");
    n=sc.next();
    System.out.println("                 CONFIRM_PAYMENT                         ");
    System.out.println("                 CANCEL_PAYMENT                          ");
    n=sc.next();
    switch(n)
    {
    case "CONFIRM_PAYMENT":
    System.out.println("  $$ CONGRATULATION,YOUR PAYMENT IS SUCCESSFUll $$   ");
    System.out.println("       --- GREAT, ORDER SUCCESSFULLY PLACED ---      ");
       break;
    case "CANCEL_PAYMENT":
    System.out.println("          _____ PAYMENT IS DECLINED _____            ");
    break;
    default:System.out.println("invalid input");
                                }
    return;
                        case "COD":
    System.out.println("       --- GREAT, ORDER SUCCESSFULLY PLACED ---      ");
    break;
    }
    return;
           default:System.out.println("invalid input");
           }
        }
           return;
           
        case "MOBILE":
        System.out.println("REALME");
        System.out.println("POCO");
        System.out.println("APPLE");
        System.out.println("VIVO");
        System.out.println("SAMSUNG");
        System.out.println("MI");
        n=sc.next();
        switch(n)
        {
        case "REALME":
        Realme_m rm=new Realme_m("realme","narzo",30000,"red",2022,"1year");
            System.out.println(         rm.Product_name);
                   System.out.println(         rm.Model_name);
                System.out.println(         rm.Product_price);
                System.out.println(         rm.Product_color);
                System.out.println(         rm.Warranty);
                //SWITCH FOR PAYMENT
        System.out.println("         -- SELECT YOUR PAYMENT OPTION --                ");
        System.out.println("=========================================================");
        System.out.println("                       COD                               ");
        System.out.println("                       UPI                               ");
                n=sc.next();
        switch(n)
        {
        case "UPI":
       
        System.out.println("=========================================================");
        System.out.println("                ENTER YOUR UPI ID:                       ");
        n=sc.next();
        System.out.println("                 CONFIRM_PAYMENT                         ");
        System.out.println("                 CANCEL_PAYMENT                          ");
        n=sc.next();
        switch(n)
        {
        case "CONFIRM_PAYMENT":
        System.out.println("  $$ CONGRATULATION,YOUR PAYMENT IS SUCCESSFUll $$   ");
        System.out.println("       --- GREAT, ORDER SUCCESSFULLY PLACED ---      ");
           break;
        case "CANCEL_PAYMENT":
        System.out.println("          _____ PAYMENT IS DECLINED _____            ");
        break;
        default:System.out.println("invalid input");
                                    }
        return;
                            case "COD":
        System.out.println("       --- GREAT, ORDER SUCCESSFULLY PLACED ---      ");
        break;
        }
        return;
        case "POCO":
        Poco_m pm=new Poco_m("Poco","M5",30000,"red",2022,"1year");
            System.out.println(          pm.Product_name);
                   System.out.println(          pm.Model_name);
                System.out.println(          pm.Product_price);
                System.out.println(          pm.Product_color);
                System.out.println(          pm.Warranty);
        }
    }
}
}



                //SWITCH FOR PAYMENT