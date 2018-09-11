package com.example.djxdu.hikingpartner.NeuralNetwork;

import java.util.ArrayList;

/**
 * Created by djxdu on 11/09/2018.
 */

public class HiddenLayer extends InputLayer {

    /**
     * Initializes the hidden layer(s) with pseudo
     random real numbers
     * @param hiddenLayer An object of the HiddenLayer class
     * @param listOfHiddenLayer a list of objects of the HiddenLayer class
     * @param inputLayer object of the InputLayer class
     * @param outputLayer object of the OutputLayer class
     * @return None
     */
    public ArrayList<HiddenLayer> initLayer(HiddenLayer hiddenLayer, ArrayList<HiddenLayer> listOfHiddenLayer, InputLayer inputLayer, OutputLayer outputLayer){

        return listOfHiddenLayer;
    }

    /**
     * Prints the weights of the layer(s)
     * @param listOfHiddenLayer A list of objects of the HiddenLayer class
     */
    public void printLayer(ArrayList<HiddenLayer> listOfHiddenLayer){

    }
}
