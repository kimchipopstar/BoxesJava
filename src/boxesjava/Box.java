/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package boxesjava;

/**
 *
 * @author j.k.
 */
public class Box {
    
    private float height;
    private float width;
    private float length;
    
    public Box(float height, float width, float length) {
        this.height = height;
        this.width = width;
        this.length = length;
    }
    
    public float calculateVolume() {
        float volume = this.height * this.width * this.length;
        return volume;
    }
    
    public float fitTimes(Box firstBox, Box secondBox) {
        float numberOfFits;
        numberOfFits = (firstBox.calculateVolume() / secondBox.calculateVolume());
        return numberOfFits;
    }
    
    
}
