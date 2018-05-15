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

class SportsOverraidVoid{

    String getName(){
        return "Generic Sports";
    }
  
    void getNumberOfTeamMembers(){
        System.out.println( "Each team has n players in " + getName() );
    }
}

class Soccer extends SportsOverraidVoid{
    @Override
    String getName(){
        return "Soccer Class";
    }
    

//@Override
//String getNumberOfTeamMembers (){
//    System.out.println( "Each team has 11 players in " + getName() );
//}

    @Override
    void getNumberOfTeamMembers() {
        super.getNumberOfTeamMembers(); //To change body of generated methods, choose Tools | Templates.
    }



	
    public static void main(String []args){
        SportsOverraidVoid c1 = new SportsOverraidVoid();
        Soccer c2 = new Soccer();
        System.out.println(c1.getName());
        c1.getNumberOfTeamMembers();
        System.out.println(c2.getName());
        c2.getNumberOfTeamMembers();
	}
}
