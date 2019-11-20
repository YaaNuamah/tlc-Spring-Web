package turntabl.io.springwebservices.controllers;
import turntabl.io.springwebservices.model.Number;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import turntabl.io.springwebservices.model.Maths;


@Api
@RestController
public class MathsController {
    @Autowired
    private Maths functions;

    @ApiOperation("add")
    @RequestMapping("/add")
    public Number add(
            @RequestParam(value="inta") String inta,
              @RequestParam(value="intb") String intb) {

        Integer result = functions.addNumbers(Integer.parseInt(inta), Integer.parseInt(intb));
        Number number = new Number();
        number.setValue(result);
        return number;
    }

        @ApiOperation("subtract")
        @RequestMapping("/subtract")
        public Number subtract(
                    @RequestParam(value="inta", defaultValue="17") int inta,
                        @RequestParam(value="intb", defaultValue="25") int intb){

            Integer result = functions.subtractNumbers(inta, intb);
            Number number = new Number();
            number.setValue(result);
            return number;
    }
}
