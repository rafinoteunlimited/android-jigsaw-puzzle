package com.jigdraw.draw.service;

import android.graphics.Bitmap;

import com.jigdraw.draw.model.Difficulty;

/**
 * Service to do jigsaw manipulations
 *
 * @author Jay Paulynice
 */
public interface JigsawService {
    /**
     * Create jigsaw by taking original image and difficulty level
     *
     * @param original the original image
     * @param level    difficulty level
     * @return true if no errors
     */
    public boolean createJigsaw(Bitmap original, Difficulty level);
}