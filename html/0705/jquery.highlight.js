(function($) {
  $.fn.highlight = function() {
    return this.each(function() {
      var $element = $(this);
      $element.css('color', 'red').css('background', 'yellow');
    });
  };
}) (jQuery);