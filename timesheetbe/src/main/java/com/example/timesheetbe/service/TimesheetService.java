package com.example.timesheetbe.service;

import com.example.timesheetbe.dto.TimesheetDto;
import com.example.timesheetbe.entity.Timesheet;
import com.example.timesheetbe.exception.AppException;
import com.example.timesheetbe.mapper.TimesheetMapper;
import com.example.timesheetbe.repository.TimesheetRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class TimesheetService {
    @Autowired
    private TimesheetRepository timesheetRepository;
    @Autowired
    private TimesheetMapper timesheetMapper;

    public List<TimesheetDto> allTimesheets() {
        return timesheetMapper.toTimesheetDtos(timesheetRepository.findAll());
    }

    public TimesheetDto createTimesheet(TimesheetDto timesheetDto) {
        Timesheet timesheet = timesheetMapper.toTimesheet(timesheetDto);

        Timesheet savedTimesheet = timesheetRepository.save(timesheet);

        return timesheetMapper.toTimesheetDto(savedTimesheet);
    }

    public TimesheetDto updateTimesheet(Long id, TimesheetDto timesheetDto) {
        Timesheet timesheet = timesheetRepository.findById(id)
                .orElseThrow(() -> new AppException("Timesheet not found", HttpStatus.NOT_FOUND));

        timesheetMapper.updateTimesheet(timesheet, timesheetMapper.toTimesheet(timesheetDto));

        Timesheet savedTimesheet = timesheetRepository.save(timesheet);

        return timesheetMapper.toTimesheetDto(savedTimesheet);
    }



    public TimesheetDto deleteTimesheet(Long id) {
        Timesheet timesheet = timesheetRepository.findById(id)
                .orElseThrow(() -> new AppException("Timesheet not found", HttpStatus.NOT_FOUND));
        TimesheetDto timesheetDto = timesheetMapper.toTimesheetDto(timesheet);

        timesheetRepository.deleteById(id);

        return timesheetDto;
    }

    public TimesheetDto getTimesheet(Long id) {
        Timesheet timesheet = timesheetRepository.findById(id)
                .orElseThrow(() -> new AppException("Timesheet not found", HttpStatus.NOT_FOUND));
        return timesheetMapper.toTimesheetDto(timesheet);
    }
}
