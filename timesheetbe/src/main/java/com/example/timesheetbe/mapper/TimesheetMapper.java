package com.example.timesheetbe.mapper;


import com.example.timesheetbe.dto.TimesheetDto;
import com.example.timesheetbe.entity.Timesheet;
import org.mapstruct.Mapper;
import org.mapstruct.MappingTarget;

import java.util.List;

@Mapper(componentModel = "spring")
public interface TimesheetMapper {

    Timesheet toTimesheet(TimesheetDto timesheetDto);

    TimesheetDto toTimesheetDto(Timesheet timesheet);

    List<TimesheetDto> toTimesheetDtos(List<Timesheet> timesheets);

    void updateTimesheet(@MappingTarget Timesheet target, Timesheet source);
}
