package com.joao.barroso.certificationsapi.modules.students.useCases;

import com.joao.barroso.certificationsapi.modules.students.dtos.VerifyHasCertificationDTO;
import org.springframework.stereotype.Service;

@Service
public class VerifyIfHasCertificationUseCase {

    public boolean execute(VerifyHasCertificationDTO dto) {
        return true;
    }
}
