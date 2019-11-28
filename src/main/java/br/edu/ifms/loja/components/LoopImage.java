/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.edu.ifms.loja.components;

import java.awt.*;
import java.awt.image.BufferedImage;

public class LoopImage {

    private BufferedImage imgs[];
    private int currentIndex;
    public long tick;
    private long lastTick;

    public LoopImage(long tick, BufferedImage... imgs) {
        this.imgs = imgs.clone();
        this.tick = tick;
        currentIndex = 0;
    }

    public void draw(Graphics2D g) {
        updateTick();
        Graphics2D g2d = (Graphics2D) g.create();
        BufferedImage current = imgs[currentIndex];
        g2d.drawImage(current, 0, 0, current.getWidth(), current.getHeight(),
                null);
        g2d.dispose();
    }

    private void updateTick() {
        long currentTick = System.currentTimeMillis();
        if (currentTick - lastTick > tick) {
            currentIndex++;
        }
        lastTick = currentTick;
        if (currentIndex == imgs.length) {
            currentIndex = 0;
        }
    }

    public BufferedImage getCurrent() {
        updateTick();
        return imgs[currentIndex];
    }

    public Dimension getSize() {
        return new Dimension(imgs[currentIndex].getWidth(), imgs[currentIndex].getHeight());
    }
}
