package com.example.djxdu.hikingpartner.NeuralNetwork;

import java.util.ArrayList;

/**
 * Created by djxdu on 11/09/2018.
 */

public class Neuron {
    /*An ArrayList variable of real numbers that
    represents the list of input weights*/
    private ArrayList<Double> listOfWeightIn;

    /*An ArrayList variable of real numbers that
    represents the list of output weights*/
    private ArrayList<Double> listOfWeightOut;

    /**Initializes listOfWeightIn and
     listOfWeightOut function with a pseudo
     random real number
     *Parameters: None
     * @return A pseudo random real number
     */
    public double initNeuron(){
        return Math.random();
    }

    /**Sets the listOfWeightIn function with a list of
     *real numbers list
     * @param listOfWeightIn The list of real numbers to be stored
    in the class object
     */
    public void setListOfWeightIn(ArrayList<Double> listOfWeightIn){
        this.listOfWeightIn = listOfWeightIn;
    }

    /**Sets the listOfWeightOut function with a list
     *of real numbers list     *
     * @param listOfWeightOut The list of real numbers to be stored
    in the class object
     */
    public void setListOfWeightOut(ArrayList<Double> listOfWeightOut){
        this.listOfWeightOut = listOfWeightOut;
    }

    /**Returns the input weights a list of neurons
     *
     * @return The list of real numbers stored in the
    listOfWeightIn variable
     */
    public ArrayList<Double> getListOfWeightIn() {
        return listOfWeightIn;
    }

    /** Returns the output weights a list of neurons
     * @return The list of real numbers stored in the
    listOfWeightOut variable
     */
    public ArrayList<Double> getListOfWeightOut() {
        return listOfWeightOut;
    }

}
