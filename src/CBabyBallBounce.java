

/**
 * <b>Program:</b> Assignment 2: Application – Baby Ball Bounce  <br>
 * <b>Filename:</b> CBabyBallBounce.java  <br>
 * <b>Date:</b> 30/4/2017  <br>
 * @version: 1.0
 * @author © Triantafyllidis Antonios
 */
public class CBabyBallBounce
{

public static void main(String[] args) {
		GUI gui = new GUI();
		World myWorld = new World(13,16,32);
		
    	gui.createFrame();
    	gui.createWorld(myWorld, gui);
    }
}

