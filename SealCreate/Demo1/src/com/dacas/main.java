package com.dacas;

/**
 * Created by dave on 2016/3/22.
 */
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;
import javax.imageio.ImageIO;

public class main
{
    public static void main(String[] args)
    {
        int canvasWidth = 400;
        int canvasHeight = 400;
        double lineArc = 80*(Math.PI/180);//角度转弧度
        String savepath = "seal.png";
        SimpleDateFormat format = new SimpleDateFormat("yyyy'年'MM'月'dd'日'");
        String head = "中国科学院信息工程研究所";
        String foot = "受理专用章";
        String center = format.format(new Date());
        BufferedImage image = GraphicsUtil.getSeal(head, center, foot, canvasWidth, canvasHeight, lineArc);

        try
        {
            ImageIO.write(image, "PNG", new File(savepath));
        }
        catch (IOException e)
        {
            e.printStackTrace();
        }
    }
}