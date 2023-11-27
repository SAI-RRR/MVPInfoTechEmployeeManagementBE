package com.example.timesheetbe.mapper;

import com.example.timesheetbe.dto.TimesheetDto;
import com.example.timesheetbe.entity.Timesheet;
import java.util.ArrayList;
import java.util.List;
import javax.annotation.processing.Generated;
import org.springframework.stereotype.Component;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2023-11-27T12:36:42+0530",
    comments = "version: 1.5.3.Final, compiler: javac, environment: Java 17.0.8 (Oracle Corporation)"
)
@Component
public class TimesheetMapperImpl implements TimesheetMapper {

    @Override
    public Timesheet toTimesheet(TimesheetDto timesheetDto) {
        if ( timesheetDto == null ) {
            return null;
        }

        Timesheet.TimesheetBuilder timesheet = Timesheet.builder();

        timesheet.id( timesheetDto.getId() );
        timesheet.empid( timesheetDto.getEmpid() );
        timesheet.name( timesheetDto.getName() );
        timesheet.date( timesheetDto.getDate() );
        timesheet.activity( timesheetDto.getActivity() );
        timesheet.hours( timesheetDto.getHours() );

        return timesheet.build();
    }

    @Override
    public TimesheetDto toTimesheetDto(Timesheet timesheet) {
        if ( timesheet == null ) {
            return null;
        }

        TimesheetDto.TimesheetDtoBuilder timesheetDto = TimesheetDto.builder();

        timesheetDto.id( timesheet.getId() );
        timesheetDto.empid( timesheet.getEmpid() );
        timesheetDto.name( timesheet.getName() );
        timesheetDto.date( timesheet.getDate() );
        timesheetDto.activity( timesheet.getActivity() );
        timesheetDto.hours( timesheet.getHours() );

        return timesheetDto.build();
    }

    @Override
    public List<TimesheetDto> toTimesheetDtos(List<Timesheet> timesheets) {
        if ( timesheets == null ) {
            return null;
        }

        List<TimesheetDto> list = new ArrayList<TimesheetDto>( timesheets.size() );
        for ( Timesheet timesheet : timesheets ) {
            list.add( toTimesheetDto( timesheet ) );
        }

        return list;
    }

    @Override
    public void updateTimesheet(Timesheet target, Timesheet source) {
        if ( source == null ) {
            return;
        }

        target.setId( source.getId() );
        target.setEmpid( source.getEmpid() );
        target.setName( source.getName() );
        target.setDate( source.getDate() );
        target.setActivity( source.getActivity() );
        target.setHours( source.getHours() );
    }
}
