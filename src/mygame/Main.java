package mygame;

import com.jme3.app.SimpleApplication;
import com.jme3.light.SpotLight;
import com.jme3.math.FastMath;
import com.jme3.renderer.RenderManager;

/**
 * test
 * @author normenhansen
 */
public class Main extends SimpleApplication {
    
    SpotLight spot = new SpotLight(); 

    public static void main(String[] args) {
        Main app = new Main();
        app.start();
    }

    @Override
    public void simpleInitApp() {
        flyCam.setMoveSpeed(10);
        Map map = new Map(assetManager);
        rootNode.attachChild(map);
        initLight();
        initShadow();
        System.out.println("These nodes are in the rootnode : " + rootNode.getChildren());
    }
    
    public void initLight()
    {
    }
    
    public void initShadow()
    {
        
    }

    @Override
    public void simpleUpdate(float tpf) {
            spot.setDirection(cam.getDirection()); 
    spot.setPosition(cam.getLocation()); 
    }

    @Override
    public void simpleRender(RenderManager rm) {
        //TODO: add render code
    }
}
