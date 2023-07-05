package com.amr.server.so.motor;

import com.amr.common.domain.Motor;
import com.amr.server.so.AbstractSystemOperation;
import java.util.List;

/**
 * Sistemska operacija za cuvanje motora
 *
 * @author Nebojsa Brankovic
 */
public class SaveMotor extends AbstractSystemOperation {

    @Override
    protected void preconditions(Object ado) throws Exception {
        if (!(ado instanceof Motor)) {
            throw new Exception("Objekat nije instanca klase Motor!");
        }

        List<Motor> motori = repository.getAll(ado);

        for (Motor motor : motori) {
            if (motor.getMotorId() == ((Motor) ado).getMotorId()) {
                throw new Exception("Vec postoji motor sa unetim id-em");
            }
        }
    }

    @Override
    protected void executeOperation(Object ado) throws Exception {
        repository.save((Motor) ado);
    }

}
