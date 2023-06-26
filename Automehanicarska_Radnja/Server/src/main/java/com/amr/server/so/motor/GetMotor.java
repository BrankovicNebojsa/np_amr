package com.amr.server.so.motor;

import com.amr.common.domain.Motor;
import com.amr.server.so.AbstractSystemOperation;
import java.util.List;

/**
 *
 * @author Nebojsa Brankovic
 */
public class GetMotor extends AbstractSystemOperation {

    private Motor motor;

    @Override
    protected void preconditions(Object ado) throws Exception {
        if (!(ado instanceof Motor)) {
            throw new Exception("Objekat nije instanca klase Motor!");
        }
    }

    @Override
    protected void executeOperation(Object ado) throws Exception {
        List<Motor> motori = repository.getAll((Motor) ado);
        for (Motor motor : motori) {
            if (motor.getKubikaza() == ((Motor) ado).getKubikaza()
                    && motor.getKonjskaSnaga() == ((Motor) ado).getKonjskaSnaga()
                    && motor.getBrojCilindara() == ((Motor) ado).getBrojCilindara()) {
                this.motor = motor;
            }
        }
    }

    public Motor getMotor() {
        return this.motor;
    }

}
