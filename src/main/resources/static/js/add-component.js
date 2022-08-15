$(document).ready(function() {

    $('#contact_form').bootstrapValidator({
        // To use feedback icons, ensure that you use Bootstrap v3.1.0 or later
        feedbackIcons: {
            valid: 'glyphicon glyphicon-ok',
            invalid: 'glyphicon glyphicon-remove',
            validating: 'glyphicon glyphicon-refresh'
        },
        fields: {
            name: {
                validators: {
                    stringLength: {
                        min: 2,
                    },
                    notEmpty: {
                        message: 'Введите наименование компонента!'
                    }
                }
            },
            package: {
                validators: {
                    stringLength: {
                        min: 2,
                    },
                    notEmpty: {
                        message: 'Введите типоразмер компонента!'
                    }
                }
            },
            amount: {
                validators: {
                    notEmpty: {
                        message: 'Введите количество!'
                    }
                }
            },
            section: {
                validators: {
                    notEmpty: {
                        message: 'Введите секцию компонента!'
                    }
                }
            },
            torque: {
                validators: {
                    notEmpty: {
                        message: 'Введите момент компонента!'
                    }
                }
            },
            current: {
                validators: {
                    notEmpty: {
                        message: 'Введите ток!'
                    }
                }
            },
            value: {
                validators: {
                    notEmpty: {
                        message: 'Введите номинал!'
                    }
                }
            },
            voltage: {
                validators: {
                    notEmpty: {
                        message: 'Введите напряжение!'
                    }
                }
            },
            forward_voltage: {
                validators: {
                    notEmpty: {
                        message: 'Введите прямое напряжение!'
                    }
                }
            },
            back_voltage: {
                validators: {
                    notEmpty: {
                        message: 'Введите обратное напряжение!'
                    }
                }
            },
            channel: {
                validators: {
                    notEmpty: {
                        message: 'Укажите тип канала!'
                    }
                }
            },
        }
    })
        .on('success.form.bv', function(e) {
            $('#contact_form').data('bootstrapValidator').resetForm();
            var token = $('#_csrf').attr('content');
            var header = $('#_csrf_header').attr('content');

            // Prevent form submission
            e.preventDefault();

            // Get the form instance
            var $form = $(e.target);
            var inputs = $("#contact_form :input").serialize();

            // Get the BootstrapValidator instance
            var bv = $form.data('bootstrapValidator');

            $.ajax ({
                url: $form.attr("action"),
                type: "POST",
                beforeSend: function (xhr){
                    xhr.setRequestHeader(header, token)
                },
                data: {

                }
            });
        });


    $("#selected_type").change(function () {

        let selected = $(this);
        console.log(selected.val())

        let torque_div = $("#torque_div");
        let current_div = $("#current_div");
        let value_div = $("#value_div");
        let voltage_div = $("#voltage_div")
        let forward_voltage_div = $("#forward_voltage_div");
        let back_voltage_div = $("#back_voltage_div");
        let channel_div = $("#channel_div");

        clear_inputs(torque_div, current_div, value_div, voltage_div, forward_voltage_div, back_voltage_div, channel_div);

        switch (selected.val()) {

            case "servo":
                torque_div.css("display", "block");
                current_div.css("display", "block");
                break;
            case "pcb":
            case "other":
            case "resistor":
                value_div.css("display", "block");
                break;
            case "capacitor":
                value_div.css("display", "block");
                voltage_div.css("display", "block");
                break;
            case "diode":
                current_div.css("display", "block");
                forward_voltage_div.css("display", "block");
                back_voltage_div.css("display", "block");
                break;
            case "transistor":
                channel_div.css("display", "block");
                current_div.css("display", "block");
                voltage_div.css("display", "block");
                break;

            case "inductance":
                value_div.css("display", "block");
                current_div.css("display", "block");
                break;
        }


    })


});

function clear_inputs(torque_div, current_div, value_div, voltage_div, forward_voltage_div, back_voltage_div, channel_div){

    torque_div.css("display", "none");
    current_div.css("display", "none");
    value_div.css("display", "none");
    voltage_div.css("display", "none");
    forward_voltage_div.css("display", "none");
    back_voltage_div.css("display", "none");
    channel_div.css("display", "none");

}