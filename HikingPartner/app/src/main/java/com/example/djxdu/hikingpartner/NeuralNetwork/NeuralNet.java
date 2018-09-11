package com.example.djxdu.hikingpartner.NeuralNetwork;

import java.util.ArrayList;

/**
 * Created by djxdu on 11/09/2018.
 */

public class NeuralNet extends OutputLayer{

    private InputLayer inputLayer;
    private HiddenLayer hiddenLayer;
    /*
     An ArrayList variable of objects of the
     HiddenLayer class. It is possible to have more
     than one hidden layer
     */
    private ArrayList<HiddenLayer> listOfHiddenLayer;
    private OutputLayer outputLayer;
    /*
    Integer number to store the quantity of layers
    that are part of the hidden layer
     */
    private int numberOfHiddenLayers;

    /**
     * Initializes the neural net as a whole. Layers are
     built, and each list of the weights of neurons is
     built randomly
     */
    public void initNet(){

    }

    /**
     * Prints the neural net as a whole. Each input and
     output weight of each layer is shown
     */
    public void printNet(){

    }

}
