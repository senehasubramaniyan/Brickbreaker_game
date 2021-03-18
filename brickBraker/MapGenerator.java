package brickBraker;

import java.awt.*;

public class MapGenerator {
    public int map[][];
    public int brickwidth;
    public int brickHeight;
    public MapGenerator(int r,int c){
        map=new int[r][c];
        for(int i=0;i<map.length;i++)
        {
            for (int j=0;j<map[0].length;j++)
            {
                map[i][j]=1;
            }
        }
        brickwidth=540/c;
        brickHeight=150/r;
    }
    public void draw(Graphics2D g)
    {
        for(int i=0;i<map.length;i++)
        {
            for(int j=0;j<map[0].length;j++)
            {
                if(map[i][j]>0)
                {
                    g.setColor(Color.WHITE);
                    g.fillRect(j*brickwidth+80,i*brickHeight+50,brickwidth,brickHeight);
                    g.setStroke(new BasicStroke(3));
                    g.setColor(Color.BLACK);
                    g.drawRect(j*brickwidth+80,i*brickHeight+50,brickwidth,brickHeight);
                }
            }
        }
    }
    public void setBrickValue(int value,int r,int c){
        map[r][c]=value;
    }
}
