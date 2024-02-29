package com.directi.training.lsp.solution;

public class ElectronicDuck extends Duck
{
    private boolean _on = false;

    @Override
    public void quack()
    {
        if (!_on) {
            System.out.println("Electronic duck quack...");
        } else {
            turnOn();
            System.out.println("Electronic duck quack...");
            turnOff();
        }
    }

    @Override
    public void swim()
    {
        if (_on) {
            System.out.println("Electronic duck swim");
        } else {
            turnOn();
            System.out.println("Electronic duck swim");
            turnOff();
        }
    }

    public void turnOn()
    {
        _on = true;
    }

    public void turnOff()
    {
        _on = false;
    }
}
