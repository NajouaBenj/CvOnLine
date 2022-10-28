package io.takima.demo.service;


import io.takima.demo.models.Cv;

import java.util.List;

public interface CvService {

    List<Cv> findAllCv();

    Cv addCv(Cv cv);

    void deleteCv(Long idc);

    void updateCv(Long idc, Cv cv);

    Cv save2(Cv cv);
}
