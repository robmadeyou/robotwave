import com.bombinggames.wurfelengine.WE;
import com.bombinggames.wurfelengine.core.Controller;
import com.bombinggames.wurfelengine.extension.basicmainmenu.BasicMainMenu;
import com.bombinggames.wurfelengine.extension.basicmainmenu.BasicMenuItem;
import com.bombinggames.wurfelengine.extension.basicmainmenu.GameViewWithCamera;
import com.bombinggames.wurfelengine.mapeditor.EditorView;

public class RobotWave
{
    public static void main(String[] args) {
        BasicMenuItem[] menuItems = new BasicMenuItem[]{
                new BasicMenuItem(0, "Load Map", Controller.class, GameViewWithCamera.class),
                new BasicMenuItem(1, "Map Editor", Controller.class, EditorView.class),
                new BasicMenuItem(2, "Exit")
        };

        WE.setMainMenu( new BasicMainMenu ( menuItems ) );
        WE.launch("Wurfelengine V" + WE.VERSION, args);
    }
}
