package com.directi.training.dip.solution;

import java.io.IOException;

public class EncodingModuleClient
{


    public static void main(String[] args) throws IOException
    {
        IdataStorage mydatabase = new MyDatabase();
        IEncoding encodingModule = new EncodingModule(mydatabase);
        encodingModule.encodeWithFiles();
        encodingModule.encodeBasedOnNetworkAndDatabase();
    }
}
