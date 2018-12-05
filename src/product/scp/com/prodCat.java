package product.scp.com;

public class prodCat {
 private String color;
 private int id;
 private String name;
/**
 * @param color
 * @param id
 * @param name
 */
public prodCat(String color, int id, String name) {
	super();
	this.color = color;
	this.id = id;
	this.name = name;
}
/**
 * @return the color
 */
public String getColor() {
	return color;
}
/**
 * @param color the color to set
 */
public void setColor(String color) {
	this.color = color;
}
/**
 * @return the id
 */
public int getId() {
	return id;
}
/**
 * @param id the id to set
 */
public void setId(int id) {
	this.id = id;
}
/**
 * @return the name
 */
public String getName() {
	return name;
}
/**
 * @param name the name to set
 */
public void setName(String name) {
	this.name = name;
}
/**
 * @return the tWheel
 */
public String gettWheel() {
	return tWheel;
}
/**
 * @param tWheel the tWheel to set
 */
public void settWheel(String tWheel) {
	this.tWheel = tWheel;
}
/**
 * @return the fWheel
 */
public String getfWheel() {
	return fWheel;
}
/**
 * @param fWheel the fWheel to set
 */
public void setfWheel(String fWheel) {
	this.fWheel = fWheel;
}
/* (non-Javadoc)
 * @see java.lang.Object#toString()
 */
@Override
public String toString() {
	return "prodCat [color=" + color + ", id=" + id + ", name=" + name + "]";
}
 
}
