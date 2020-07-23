package Model;

import javazoom.jl.decoder.JavaLayerException;
import javazoom.jl.player.Player;
import java.io.BufferedInputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;

/**
 * 消息提示音的播放
 */
public class playSound {
    Player player;
    public playSound(){

    }
    public void play() throws FileNotFoundException, JavaLayerException {
    	//获取提示音文件路径
        BufferedInputStream buffer = new BufferedInputStream(new FileInputStream(new File("E:\\javaLastWork\\chat\\src\\Model\\qq.mp3")));
        player = new Player(buffer);
        player.play();
    }
}
