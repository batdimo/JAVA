/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package classesshown;

/**
 *
 * @author DIMO
 */
abstract class BookAbstractOverrideShown {
	String title;
	abstract void setTitle(String s);
	String getTitle(){
		return title;
        }
    
}
class MyBook extends BookAbstractOverrideShown {
    @Override
    void setTitle(String s) {
        title = s;
    }
}