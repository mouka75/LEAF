package com.example.djxdu.hikingpartner.NeuralNetwork;

import java.util.ArrayList;

/**
 * Created by djxdu on 11/09/2018.
 */

public abstract class Layer extends Neuron {
    /*
    An ArrayList variable of objects of the
    Neuron class
    */
    private ArrayList<Neuron> listOfNeurons;

    /*
    Integer number to store the quantity of neurons
    that are part of the layer
     */
    private int numberOfNeuronsInLayer;

    /**
     * Returns the list of neurons by layer
     *
     * @return An ArrayList variable of objects by
     * the Neuron class
     */
    public ArrayList<Neuron> getListOfNeurons() {
        return listOfNeurons;
    }

    /**
     * Sets the listOfNeurons function with
     * an ArrayList variable of objects of the
     * Neuron class
     *
     * @param listOfNeurons The list of objects of the Neuron
     *                      class to be stored
     */
    public void setListOfNeurons(ArrayList<Neuron> listOfNeurons) {
        this.listOfNeurons = listOfNeurons;
    }

    /**
     * Returns the number of neurons by layer
     *
     * @return The number of neurons by layer
     */
    public int getNumberOfNeuronsInLayer() {
        return numberOfNeuronsInLayer;
    }

    /**
     * Sets the number of neurons in a layer
     *
     * @param numberOfNeuronsInLayer the number of neurons in a layer
     */
    public void setNumberOfNeuronsInLayer(int numberOfNeuronsInLayer) {
        this.numberOfNeuronsInLayer = numberOfNeuronsInLayer;
    }

}
