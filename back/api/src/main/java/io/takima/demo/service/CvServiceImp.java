package io.takima.demo.service;

import io.takima.demo.Repository.CvRepository;
import io.takima.demo.models.Cv;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.List;
@Transactional
@Service
public class CvServiceImp implements CvService{

    @Autowired
    private CvRepository cvRepository;

    @Override
    public List<Cv> findAllCv() {
        return cvRepository.findAll();
    }

    @Override
    public Cv addCv(Cv cv) {
        return cvRepository.save(cv);
    }

    @Override
    public void deleteCv(Long idc) {
        cvRepository.deleteById(idc);

    }

    @Override
    public void updateCv(Long idc, Cv cv) {
        cvRepository.deleteById(idc);
        cv.setId(idc);
        cvRepository.save(cv);

    }

    @Override
    public Cv save2(Cv cv) {
        cvRepository.save(cv);
        return cv;
    }
}
