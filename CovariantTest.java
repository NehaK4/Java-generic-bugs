class Point {
int x;
int y ;
public Point(int x, int y)
{
	this.x=x;
	this.y=y;
}
boolean equal(Point p) {
return ((x==p.x)&&(y==p.y));
}
}
class ColPoint extends Point {
String c;
public ColPoint(int x, int y, String c)
{
	super.x=x;
	super.y=y;
	this.c=c;
}
boolean equal(ColPoint p) {
return ((x==p.x)&&(y==p.y)&&(c==p.c));
}
}
class CovariantTest
{
public static void main(String ar[])
{
Point a = new ColPoint(2,21, "white");
Point b = new Point(2,21);
boolean bool=a.equal(b);

}}