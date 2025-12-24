<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
  <!-- Hero Section Begin -->
  <section class="hero hero-normal">
    <div class="container">
      <div class="row">
        <div class="col-lg-3">
          <div class="hero__categories">
            <div class="hero__categories__all">
              <i class="fa fa-bars"></i>
              <span>All departments</span>
            </div>
            <ul>
              <li><a href="#">Fresh Meat</a></li>
              <li><a href="#">Vegetables</a></li>
              <li><a href="#">Fruit & Nut Gifts</a></li>
              <li><a href="#">Fresh Berries</a></li>
              <li><a href="#">Ocean Foods</a></li>
              <li><a href="#">Butter & Eggs</a></li>
              <li><a href="#">Fastfood</a></li>
              <li><a href="#">Fresh Onion</a></li>
              <li><a href="#">Papayaya & Crisps</a></li>
              <li><a href="#">Oatmeal</a></li>
              <li><a href="#">Fresh Bananas</a></li>
            </ul>
          </div>
        </div>
        <div class="col-lg-9">
          <div class="hero__search">
            <div class="hero__search__form">
              <form action="#">
                <div class="hero__search__categories">
                  All Categories
                  <span class="arrow_carrot-down"></span>
                </div>
                <input type="text" placeholder="What do yo u need?">
                <button type="submit" class="site-btn">SEARCH</button>
              </form>
            </div>
            <div class="hero__search__phone">
              <div class="hero__search__phone__icon">
                <i class="fa fa-phone"></i>
              </div>
              <div class="hero__search__phone__text">
                <h5>+65 11.188.888</h5>
                <span>support 24/7 time</span>
              </div>
            </div>
          </div>
        </div>
      </div>
    </div>
  </section>
  <!-- Hero Section End -->

  <!-- Breadcrumb Section Begin -->
  <section class="breadcrumb-section set-bg" data-setbg="/img/breadcrumb.jpg">
    <div class="container">
      <div class="row">
        <div class="col-lg-12 text-center">
          <div class="breadcrumb__text">
            <h2>상세보기</h2>
          </div>
        </div>
      </div>
    </div>
  </section>
  <!-- Breadcrumb Section End -->
<div id="seoul_detail">
  <!-- Product Details Section Begin -->
  <section class="product-details spad">
    <div class="container">
      <div class="row">
        <div class="col-lg-6 col-md-6">
          <div class="product__details__pic">
            <div class="product__details__pic__item">
              <img class="product__details__pic__item--large" :src="store.detail.poster" style="width: 100%; height: 400px">
            </div>
          </div>
        </div>
        <div class="col-lg-6 col-md-6">
          <div class="product__details__text">
            <h3>{{store.detail.title}}</h3>
            <div class="product__details__rating">
              <i class="fa fa-star"></i>
              <i class="fa fa-star"></i>
              <i class="fa fa-star"></i>
              <i class="fa fa-star"></i>
              <i class="fa fa-star-half-o"></i>
              <span>(18 reviews)</span>
            </div>
            <p>{{store.detail.msg}}</p>
            <ul>
              <li><b>주소</b> <span>{{store.detail.address}}</span></li>
              <li><b>조회수</b> <span>{{store.detail.hit}}</span></li>
              <li class="text-right"><button class="btn-xs btn-danger" onclick="javascript:history.back()">목록</button></li>
            </ul>
          </div>
        </div>
        <div class="col-lg-12">
          <div class="product__details__tab">
            <ul class="nav nav-tabs" role="tablist">
              <li class="nav-item">
              
              </li>
            </ul>
            <div class="tab-content">
              <div class="tab-pane active" id="tabs-1" role="tabpanel">
                <div class="product__details__tab__desc">
                 
                </div>
              </div>
            </div>
          </div>
        </div>
      </div>
    </div>
  </section>
  <!-- Product Details Section End -->

  <!-- Related Product Section Begin -->
  <section class="related-product">
    <div class="container">
      <div class="row">
        <div class="col-lg-12">
          <div class="section-title related__product__title">
            <h2>주변 맛집</h2>
          </div>
        </div>
      </div>
      <div class="row">
        <div class="col-lg-3 col-md-4 col-sm-6">
          <div class="product__item">
            <div class="product__item__pic set-bg" data-setbg="/img/product/product-1.jpg">
              <ul class="product__item__pic__hover">
                <li><a href="#"><i class="fa fa-heart"></i></a></li>
                <li><a href="#"><i class="fa fa-retweet"></i></a></li>
                <li><a href="#"><i class="fa fa-shopping-cart"></i></a></li>
              </ul>
            </div>
            <div class="product__item__text">
              <h6><a href="#">Crab Pool Security</a></h6>
              <h5>$30.00</h5>
            </div>
          </div>
        </div>
        <div class="col-lg-3 col-md-4 col-sm-6">
          <div class="product__item">
            <div class="product__item__pic set-bg" data-setbg="/img/product/product-2.jpg">
              <ul class="product__item__pic__hover">
                <li><a href="#"><i class="fa fa-heart"></i></a></li>
                <li><a href="#"><i class="fa fa-retweet"></i></a></li>
                <li><a href="#"><i class="fa fa-shopping-cart"></i></a></li>
              </ul>
            </div>
            <div class="product__item__text">
              <h6><a href="#">Crab Pool Security</a></h6>
              <h5>$30.00</h5>
            </div>
          </div>
        </div>
        <div class="col-lg-3 col-md-4 col-sm-6">
          <div class="product__item">
            <div class="product__item__pic set-bg" data-setbg="/img/product/product-3.jpg">
              <ul class="product__item__pic__hover">
                <li><a href="#"><i class="fa fa-heart"></i></a></li>
                <li><a href="#"><i class="fa fa-retweet"></i></a></li>
                <li><a href="#"><i class="fa fa-shopping-cart"></i></a></li>
              </ul>
            </div>
            <div class="product__item__text">
              <h6><a href="#">Crab Pool Security</a></h6>
              <h5>$30.00</h5>
            </div>
          </div>
        </div>
        <div class="col-lg-3 col-md-4 col-sm-6">
          <div class="product__item">
            <div class="product__item__pic set-bg" data-setbg="/img/product/product-7.jpg">
              <ul class="product__item__pic__hover">
                <li><a href="#"><i class="fa fa-heart"></i></a></li>
                <li><a href="#"><i class="fa fa-retweet"></i></a></li>
                <li><a href="#"><i class="fa-solid fa-calendar-days"></i></a></li>
              </ul>
            </div>
            <div class="product__item__text">
              <h6><a href="#">Crab Pool Security</a></h6>
              <h5>$30.00</h5>
            </div>
          </div>
        </div>
      </div>
    </div>
  </section>
</div>
  <!-- Related Product Section End -->
  <script src="/seouljs/seoulStore.js"></script>
  <script>
    const detailApp = Vue.createApp({
	  setup() {
		const store = useSeoulStore()
		const params = new URLSearchParams(location.search)
		const no = params.get('no')
		const type = params.get('type')
		
		Vue.onMounted(() => {
		  store.seoulDetailData(no, type)
		})
		
		return {
		  store
		}
	  }
    })
    detailApp.use(Pinia.createPinia())
    detailApp.mount('#seoul_detail')
  </script>
</body>
</html>