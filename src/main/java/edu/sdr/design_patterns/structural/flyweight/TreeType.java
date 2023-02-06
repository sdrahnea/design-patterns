package edu.sdr.design_patterns.structural.flyweight;

import java.awt.*;

/**
 * Contains state shared by several trees
 */
public class TreeType {
    private String name;
    private Color color;
    private String otherTreeData;

    public TreeType(String name, Color color, String otherTreeData) {
        this.name = name;
        this.color = color;
        this.otherTreeData = otherTreeData;
    }

    public void draw(Graphics g, int x, int y) {
        g.setColor(Color.BLACK);
        g.fillRect(x - 1, y, 3, 5);
        g.setColor(color);
        g.fillOval(x - 5, y - 10, 10, 10);
    }
}


/**
 *
 * Persoana(id, nume, compania_id)
 * 1, num1,  1
 * 2, num2,  2
 * 3, num3,  1
 * 4, num4,  1
 * 5, num4,  2
 *
 *
 * Companie(id, denumire)
 * 1, compania1
 * 2, compania2
 *
 */