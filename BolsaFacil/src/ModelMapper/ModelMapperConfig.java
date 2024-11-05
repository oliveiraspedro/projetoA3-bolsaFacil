package ModelMapper;

import DTOs.AlunoDTO;
import Entities.Aluno;
import org.modelmapper.ModelMapper;
import org.modelmapper.Converter;
import org.modelmapper.spi.MappingContext;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class ModelMapperConfig {

    private static final String DATE_FORMAT = "dd/MM/yyyy";
    private static final SimpleDateFormat DATE_FORMATTER = new SimpleDateFormat(DATE_FORMAT);

    public static ModelMapper getModelMapper() {
        ModelMapper modelMapper = new ModelMapper();

        // Conversor de String para Date
        Converter<String, java.sql.Date> stringToSqlDateConverter = new Converter<>() {
            @Override
            public java.sql.Date convert(MappingContext<String, java.sql.Date> context) {
                try {
                    // Converte a String para java.util.Date e depois para java.sql.Date
                    Date utilDate = DATE_FORMATTER.parse(context.getSource());
                    return new java.sql.Date(utilDate.getTime());
                } catch (ParseException e) {
                    throw new RuntimeException("Data de nascimento inválida. Use o formato dd/MM/yyyy.", e);
                }
            }
        };

        // Configura o ModelMapper para usar o conversor customizado para datas
        modelMapper.typeMap(AlunoDTO.class, Aluno.class)
                .addMappings(mapper -> mapper.using(stringToSqlDateConverter)
                        .map(AlunoDTO::getData_nascimento, Aluno::setData_nascimento));

        return modelMapper;
    }
}
