

window.onload = function () {

  (function () {

  function Product(name, price, category) {
    this.name = name;
    this.price = price;
    this.category = category;
  }

  Product.prototype.getProductDiscount = function (percent) {
    var discountAmount = (this.price * percent) / 100;
    return this.price - discountAmount;
  };

  var productData = [
    {
      name: "Product_1",
      price: 100,
      category: "Product Category_A",
    },
    {
      name: "Product_2",
      price: 200,
      category: "Product Category_B",
    },
    {
      name: "Product_3",
      price: 300,
      category: "Product Category_C",
    },
    {
      name: "Product_4",
      price: 400,
      category: "Product Category_D",
    },
  ];

  var products=[];


  function createProducts() {

    const productContainer = document.getElementById("product-container");

    for (var prod of productData){

      function createSingleProduct() {
        var product = new Product(prod.name, prod.price, prod.category);
        products.push(product);

        var productCard = document.createElement("div");
        productCard.classList.add("product-card");

        var productName = document.createElement("div");
        productName.classList.add("product-name");
        productName.textContent=`product_name: ${product.name}`;

        var productPrice = document.createElement("div");
        productPrice.classList.add("product-price");
        productPrice.textContent=`product_price: ${product.price}`;

        var productCategory = document.createElement("div");
        productCategory.classList.add("product-category");
        productCategory.textContent=`product_category: ${product.category}`;

        var discountOnProduct = document.createElement("div");
        discountOnProduct.classList.add("discount");
        discountOnProduct.textContent="discount_on_product: 10%";

        var productDiscount = document.createElement("div");
        productDiscount.classList.add("product-discount");
        productDiscount.textContent=`product_price_after_discount: ${product.getProductDiscount(10)}`;
        
        productCard.appendChild(productName);
        productCard.appendChild(productPrice);
        productCard.appendChild(productCategory);
        productCard.appendChild(discountOnProduct);
        productCard.appendChild(productDiscount);
        productContainer.appendChild(productCard);

        // add event listener to the products
        productCard.addEventListener("mouseenter", () => {
            productCard.classList.add("product-hover");
        })

        productCard.addEventListener("mouseleave", () => {
            productCard.classList.remove("product-hover");
        })

      }
      createSingleProduct();
    }


}

 function getHighestPrice(otherProduct){
    if(!this || !this.price){
        return otherProduct;
    }
    if(otherProduct.price>this.price){
        return otherProduct;
    }
    return this;
 }

  function showCostliestProduct() {
    var costliestProductContainer = document.getElementById("expensive-product");

    var costliest;
    for(var prod of products){
        costliest=getHighestPrice.call(costliest, prod);
    }
    costliestProductContainer.textContent=costliest.price;
    
  }
  createProducts();
  showCostliestProduct();
})();

}