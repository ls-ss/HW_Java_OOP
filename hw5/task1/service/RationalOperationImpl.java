package hw5.task1.service;

import hw5.task1.model.Example;

/**
 * Интерфейс Operation для рациональных чисел
 */
public class RationalOperationImpl implements Operation<Number> {
    @Override
    public Number sum(Example<Number> example) {
        if (example.getVariableA() instanceof Integer) {
            return (Integer) example.getVariableA() + (Integer) example.getVariableB();
        } else if (example.getVariableA() instanceof Double) {
            return (Double) example.getVariableA() + (Double) example.getVariableB();
        } else if (example.getVariableA() instanceof Float) {
            return (Float) example.getVariableA() + (Float) example.getVariableB();
        } else {
            return null;
        }
    }

    @Override
    public Number divide(Example<Number> example) {
        if (example.getVariableA() instanceof Integer) {
            return (Integer) example.getVariableA() / (Integer) example.getVariableB();
        } else if (example.getVariableA() instanceof Double) {
            return (Double) example.getVariableA() / (Double) example.getVariableB();
        } else if (example.getVariableA() instanceof Float) {
            return (Float) example.getVariableA() / (Float) example.getVariableB();
        } else {
            return null;
        }
    }

    @Override
    public Number difference(Example<Number> example) {
        if (example.getVariableA() instanceof Integer) {
            return (Integer) example.getVariableA() - (Integer) example.getVariableB();
        } else if (example.getVariableA() instanceof Double) {
            return (Double) example.getVariableA() - (Double) example.getVariableB();
        } else if (example.getVariableA() instanceof Float) {
            return (Float) example.getVariableA() - (Float) example.getVariableB();
        } else {
            return null;
        }
    }

    @Override
    public Number multiply(Example<Number> example) {
        if (example.getVariableA() instanceof Integer) {
            return (Integer) example.getVariableA() * (Integer) example.getVariableB();
        } else if (example.getVariableA() instanceof Double) {
            return (Double) example.getVariableA() * (Double) example.getVariableB();
        } else if (example.getVariableA() instanceof Float) {
            return (Float) example.getVariableA() * (Float) example.getVariableB();
        } else {
            return null;
        }
    }
}
